package com.D2722y.pack;

import java.util.Scanner;

public class ToPrintNumTable {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the Number:\nWhich we want table");
		int num=src.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+(i*num));			
		}
		System.out.println("To print tables from numbers with the for looping");
		System.out.println("******************");
		
		
		int a=1;
		while(a<=10)
		{
			System.out.println(num+" * "+a+" = "+(a*num));
			a++;
		}
		System.out.println("To print tables from numbers with the While looping");
		System.out.println("******************");
		
		
	}

}
