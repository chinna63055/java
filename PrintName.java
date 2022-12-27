package com.loku.pack;

import java.util.Scanner;

public class PrintName {
	public  static void  PrintName(String name) {
		System.out.println("Your Name is "+name);
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name=src.next();
		PrintName(name);
		System.out.println("thanks");
		return;
	}

}
