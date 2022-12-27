



package com.loku.pack;

import java.util.Scanner;

public class ArgAndreturn 
{
	public static int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args)
	{
		int catch1=factorial(5);
		
		System.out.println(catch1);
	}

}


//no arg no return
// arg no return
//no arg return
//arg and return-------------------------






