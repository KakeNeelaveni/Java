package com.apjfsa;

import java.util.Scanner;

public class DemoContinue {

	public static void main(String[] args) {
		int range,sum=0;
		System.out.println("Enter range");
		Scanner sc=new Scanner(System.in);
		range=sc.nextInt();
		for(int i=0;i<=range;i++) {
			if(i%2!=0)//sum of even number
				continue;
			sum+=i;
			System.out.println(sum);
		}
	}

}
