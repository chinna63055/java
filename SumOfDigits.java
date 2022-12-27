package com.looping.pack;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=src.nextInt();
		int sum=0;
		int res;
		int fact=1;
		for(int i=1;i<=10;i++)
		{
			sum=sum+i;
			res=i*n;
			System.out.println(n+" * "+i+" = "+res);
		}
		
		System.out.println("***************************************************");

		System.out.println(sum);
		System.out.println("***************************************************");
		for(int j=n;j>=1;j--)
		{
			fact=fact*j;
		}
		System.out.println("this is the "+n+" factorial"+"is :"+fact);

	}

}
