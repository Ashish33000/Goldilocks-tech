package goldflic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {
		String file="src//student.csv";
		BufferedReader reader=null;
		String line="";
		try {
			reader=new BufferedReader(new FileReader(file));
			while((line=reader.readLine())!=null) {
				String [] row=line.split(",");
				for(String i:row) {
					System.out.print(" "+i);
				}
				System.out.println();
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			reader.close();
		}
		
	}

}
