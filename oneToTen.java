package com.D2722y.pack;

public class oneToTen {

	public static void main(String[] args) {
		
		// To print 1 To 10 numbers
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("To print 1 to 10 numbers with the for looping");
		System.out.println("******************");
		int a=1;
		while(a<=10) {
			System.out.println(a);
			a++;
		}
		System.out.println("To print 1 to 10 numbers with the While looping");
		System.out.println("******************");
		int b=1;
		while(b<=10)
		{
			if(b%2!=0)
			{
				System.out.println(b);
			}
			b++;
		}
		System.out.println("To print odd numbers from 1 to 10 numbers with the While looping");
		System.out.println("******************");

		int c=1;
		while(c<=10)
		{
			if(c%2!=0)
			{
				System.out.println(c);
			}
			c++;
		}
		System.out.println("To print Even numbers from 1 to 10 numbers with the While looping");
		System.out.println("******************");
		
	}

}
