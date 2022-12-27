package com.loku.pack;

import java.util.Scanner;

public class Fact {
	public static void f()
	{
		System.out.println("Thanks");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tic=new Scanner(System.in);
		System.out.println("enter :");
		float num=tic.nextFloat();
		float fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
			System.out.println(num+" != "+fact);
		}
		System.out.println(num+" != "+fact);
		f();
		
		

	}

}
