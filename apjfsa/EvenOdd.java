package com.apjfsa;

import java.util.Scanner;

public class EvenOdd {
	
	static void checkNum(int n) {
		//check given number is even or odd
		
		if(n%2==0)
			System.out.println(n+"is a even number");
		else
			System.out.println(n+"is a odd number");
			
		
	}

	public static void main(String[] args) {
		//local variable
		int num;
		System.out.println("Enter a number:");
		//reading values from console
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		//check the number is odd r even
		checkNum(num); //call method without obj for static method       
		
		
		
		
	}

}
