package com.goldflic;
import java.util.*;
public class Demo {
	public static void main(String[] args) {
		System.out.println("Enter String ");
		Scanner sc=new Scanner(System.in);
		String decimal=sc.nextLine();
    	System.out.println(dcimaltoBinary(decimal));
		
	}
	public static String dcimaltoBinary(String decimal) {
		int decimalNum=Integer.parseInt(decimal);
		String binary=Integer.toBinaryString(decimalNum);
		
		return binary;
	}
	
	

}
