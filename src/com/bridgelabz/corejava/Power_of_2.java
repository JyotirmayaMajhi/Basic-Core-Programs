package com.bridgelabz.corejava;
import java.util.Scanner;
public class Power_of_2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int b;//base
		int n;//exponent
		b=sc.nextInt();
		System.out.println("Enter the base: "+b);
		n=sc.nextInt();
		System.out.println("Enter the Exponent: "+n);
		int power=1;
		for(int i=1;i<=n;i++) {
			
			power=power*2;
			System.out.println("The Power of 2 is:" +power );
			
		}
		

	}

}
