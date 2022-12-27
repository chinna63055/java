package com.Number.pack;

import java.util.Scanner;

public class MonthAndYear {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the Year \nTo know that leap year or not:");
		int y=src.nextInt();
		System.out.println("Enter the Month\nTo know about the days of the month");
		int m=src.nextInt();
		if((m==1)||(m==3)||(m==5)||(m==7)||(m==8)||(m==10)||(m==12))
		{
			System.out.println("In this month 31 Days");
		}
		if((m==4)||(m==6)|(m==9)||(m==11))
		{
			System.out.println("In this month 30 Days");
		}
		if(m==2)
		{
			System.out.println("In this month 28 Days");
		}
		if( (y%400==0) && ( (y%4==0) && (y%100!=0) ) )
		{
			System.out.println("\n");
			System.out.println(y+" Is the Leap Year\n");
		}
		else
		{
			System.out.println(y+" Is Not a Leap Year");
		}
	}

}
