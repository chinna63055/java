package com.loku.pack;

import java.util.Scanner;

public class F {
	public static void f() {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the num :");
		int num=src.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(num+"factorial is"+" = "+fact);
		System.out.println("Thank you");
	}

	public static void main(String[] args) {
		
		f();
	}

}

//no Argument and 