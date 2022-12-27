package com.loku.pack;

import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		System.out.println("Enter :");
		int amt=src.nextInt();
		if(amt>=2000) 
		{
			int countamt=amt/2000;
			System.out.println("2000 * "+countamt+"= "+(countamt*2000));
			amt=amt%2000;
			System.out.println(amt);
		}
		

	}

}
