package com.loku.pack;

import java.util.Scanner;

public class powerOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		System.out.println("Enter Num and Power");
		int num=src.nextInt();
		int power=src.nextInt();
		System.out.println(Math.pow(num, power));
		for(int i=1;i<=power;i++)
		{
			power=power*i;
		}
		System.out.println(power);
		System.out.println(num);
		System.out.println(Math.pow(num, power));
	}

}

