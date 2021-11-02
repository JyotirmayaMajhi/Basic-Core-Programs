package com.bridgelabz.corejava;
import java.util.Scanner;
public class Harmonic_Number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double result=0,num=0,i;
		int n;
		n=sc.nextInt();

		
		System.out.print("enter the harmonic you want to find: ");
		

		
		for (i = 1; i <= n; i++) {
			num = num + (1 / i);
			result = num;
		}
		System.out.println("the value of harmonic no. " + n + " is: " + result);
		

	}

}
