package com.fact.pack;

import java.util.*;

public class noArgRet {
	public static void G()
	{	Scanner src=new Scanner(System.in);
	System.out.println("Enter this number:");
	int num=src.nextInt();
	if(num<0)
	{
		System.out.println("not valid data");
	}
	int fact=1;
		for(int i=1;i<=num;i++)
		{
		 fact=fact*i;
			
		}
		System.out.println(num+" != "+"this is fact "+fact);
	}
	public static void main(String[] args) {
		
		G();
		

	}

}
