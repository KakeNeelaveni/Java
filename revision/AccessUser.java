package com.revision;

import java.util.Scanner;

public class AccessUser {

	public static void main(String[] args) {

		System.out.println("Enter username:");
		Scanner sc = new Scanner(System.in);
		String username = sc.next();
		System.out.println("Enter Income");
		int income = sc.nextInt();

		if (income < 100000) {
			System.out.println("Anudip Application is accessed");
		} else {
			System.out.println("Not accessed");
		}
	}

}
