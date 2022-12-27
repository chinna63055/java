package com.Number.pack;

import java.util.Scanner;

public class NumOfDaysSwitch {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter Year and Month:");
		int y=src.nextInt();
		int m=src.nextInt();
		switch(m)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 Days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 Days");
			break;
		case 2: 
			if((y%400==0)&&((y%4==0)&&(y%100!=0)))
			{
				System.out.println("is this the Leap Year");
				System.out.println("29 Days");
				break;
			}
			else
			{
				System.out.println("28 Days");
				break;
			}
			default :
				System.out.println("invalid Month");
		}
	}

}
