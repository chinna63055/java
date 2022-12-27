package Fibonacci.pack;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter Number Of Fibonacci series :");
		int num=src.nextInt();
		int a,b,c;
		a=0;
		b=1;
		c=0;
		System.out.print(a+" "+b);
		for(int i=3;i<=num;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}

}
