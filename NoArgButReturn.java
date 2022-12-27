
package com.loku.pack;

import java.util.Scanner;

public class NoArgButReturn 
{
	public static int factorial()
	{
		Scanner src=new Scanner(System.in);
		System.out.println("Please Give me input:");
		int num=src.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args)
	{
		int result=factorial();//catch1 is used as storing the data for the future perpose
		
		System.out.println("result is "+result);
	}

}


//no arg no return
// arg no return
//no arg return-----------------------
//arg and return





