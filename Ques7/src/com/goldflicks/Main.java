package com.goldflicks;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length>0) {
			System.out.println("Before diff args passes  from java from command line");
			for(String a:args) {
				System.out.println(a);
			}
		}else {
			System.out.println("No Args pass");
		}

	}

}
