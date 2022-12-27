package com.loku.pack;

import java.util.Scanner;

public class ArgWithNoreturn 
{
	public static void factorial(int num)
	{
		
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(num+" != "+fact);
	}
	
	public static void main(String[] args)
	{
		Scanner src=new Scanner(System.in);
		System.out.println("Please Give me input:");
		int num=src.nextInt();
		factorial(num);
	}

}


//no arg no return--------------------------
// arg no return
//no arg return
//arg and return



