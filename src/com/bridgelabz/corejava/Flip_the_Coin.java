package com.bridgelabz.corejava;
import java.util.Scanner;
public class Flip_the_Coin {
	public static final int Coin_Flip_Chance=10;
	public static void main(String[] args) {
		System.out.println("Enter The number of times to Flip Coin. ");
		Scanner sc = new Scanner(System.in);
		int Coin_Flip_Chance = sc.nextInt();
		int Chance = 1;
		double heads = 0;
		double tails = 0;
		int i = 0;

		for (i = 0; i < Coin_Flip_Chance; i++) {
			int flip = (int) ((Math.random() * 10) % 2);
			System.out.println("Flip : " + flip);
			if (flip <= 0.5) {
				System.out.println("Heads");
				heads++;

			} else {
				System.out.println("Tails");
				tails++;

			}

		}
		
		double percentage_of_heads = (heads / Coin_Flip_Chance) * 100;
		double percentage_of_tails = (tails / Coin_Flip_Chance) * 100;
		System.out.println("Percentage of Heads : " + percentage_of_heads);
		System.out.println("Percentage of tails : " + percentage_of_tails);

	}

}
