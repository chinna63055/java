package com.loku.pack;

import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the Num:");
		int num=src.nextInt();
		int a,b,c;
		a=0;
		b=1;
		c=0;
		if(num==1)
		{
			System.out.println(a);
			return;
		}
		System.out.print(a+" "+b);
				
		
		int i=3;
			while(i<=num)
			{
				c=a+b;
				System.out.print(" "+c);
				i++;
				a=b;
				b=c;
			}
		

	}

}
