package com.bridgelabz.corejava;
import java.util.Scanner;
public class EvenOddNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter a Number:");
		n=sc.nextInt();
		
		if(n % 2 == 0 )
		{
			System.out.println("Its an Even Number");
		}
		else
		{
			System.out.println("Its an Odd Number");
		}
		

	}

}
