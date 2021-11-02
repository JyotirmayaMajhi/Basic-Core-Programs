package com.bridgelabz.corejava;
import java.util.Scanner;
public class Swaping {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter the first number");
		n=sc.nextInt();
		int m;
		System.out.println("Enter the second number");
		m=sc.nextInt();
		System.out.println("Before swapping numbers "+n +"  "+ m);
		int t;
		
		t=n;
		n=m;
		m=t;
		
		System.out.println("After swapping numbers "+n +"  "+ m);
		
		
	}

}
