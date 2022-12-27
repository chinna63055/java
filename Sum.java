package com.loku.pack;

import java.util.Scanner;

public class Sum {
	
	public static int Sumab(int a,int b) {
		//int result=a+b;
		//System.out.println(result);
		return a+b;
		
	}
	
	public static void main(String []args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the two number\nA and B:");
		int a=src.nextInt();
		int b=src.nextInt();
		//Sumab(a,b);
		System.out.println("the Addition of the Given"+Sumab(a,b));
	}
}
