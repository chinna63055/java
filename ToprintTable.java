package com.loku.pack;

import java.util.*;

public class ToprintTable {
	public static void table(int num) {
		int fact=1;
		for(int i=1;i<=10;i++) {
			fact=num*i;
			System.out.println(num+"  * "+i+"  = "+fact);
		}
		return;
	}

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=src.nextInt();
		table(num);
	}

}
