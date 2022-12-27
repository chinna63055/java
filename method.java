package com.loku.pack;

import java.util.Scanner;

public class method {
	
	public static void factorial()
	{
		Scanner src=new Scanner (System.in);
		System.out.println("please Give me input:");
		int num=src.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(num+" != "+fact);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			factorial();
			
	}

}
