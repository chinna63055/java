package com.D2722y.pack;

import java.util.Scanner;

public class ToCountLenthNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the Numbers:");
		int num=src.nextInt();
		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;//num/=10;
		}
		System.out.println("This is the length "+count);
	}

}
