package com.D2722y.pack;

import java.util.Scanner;

public class FactorialWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=src.nextInt();
		int j=1;
		int facto=1;
		while(j<=num)
		{
			facto=facto*j;
			j++;
		}
		System.out.println("This is the factorial of "+num+" is "+facto);
		System.out.println("This is the factorial "+num+"!= "+facto);

	}

}
