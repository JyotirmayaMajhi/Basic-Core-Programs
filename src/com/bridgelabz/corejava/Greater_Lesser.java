package com.bridgelabz.corejava;
import java.util.Scanner;
public class Greater_Lesser {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a;
		System.out.println("Enter the first number:");
		a=sc.nextInt();
		int b;
		System.out.println("Enter the second number:");
		b=sc.nextInt();
		int c;
		System.out.println("Enter the third number:");
		c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else if(c>a && c>b)
		{
			System.out.println("c is greater");
		}
		
	}

}
