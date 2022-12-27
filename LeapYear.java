package com.Number.pack;

import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the Year \nTo know that leap year or not:");
		int y=src.nextInt();
		if((y%400==0)&&((y%4==0)&&(y%100!=0))) 
		{
			System.out.println(y+"is the Leap Year");
		}
		else
		{
			System.out.println(y+" is not a Leap Year");
		}
	}

}
	

