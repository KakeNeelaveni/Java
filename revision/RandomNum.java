package com.revision;

import java.util.Random;
import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) {
		System.out.println("Guess a number below 100:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		Random ran = new Random();

		int target = ran.nextInt(100);

		while (num != target) {
			if (num > target) {
				System.out.println("your guess is greater,guess again");
				num = sc.nextInt();
			} else if (num < target) {
				System.out.println("your guess is lower,guess again");
				num = sc.nextInt();
			}

		}

		System.out.println("Your guess is correct congrats!!" + num);

	}

}
