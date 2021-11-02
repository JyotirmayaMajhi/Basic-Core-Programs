package com.bridgelabz.corejava;
import java.util.Scanner;
public class Vowels_or_Consonants {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an Alphabet: ");
		Character ch =sc.next().charAt(0);
		
		
		if(ch == 'a'|| ch == 'e'|| ch == 'i'| ch == 'o'|| ch == 'u')
		{
			System.out.println("The alphabet is Vowel");
		}
		else
		{
			System.out.println("The alphabet is Consonant");
		}

	}

}
