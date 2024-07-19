//program to calculate sum of numbers based on given range
package com.apjfsa;

import java.util.Scanner;

public class DemoWhile {
	
	public void sumN(int n) {
		int i=1,sum=0;
		while(i<=n) {
			sum+=i;
		    i++;
		}
		System.out.println("sum of "+n+"numbers ="+sum);
	}
	public static void main(String[] args) {
		DemoWhile d=new DemoWhile();
		System.out.println("enter the number");
		int num;
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		d.sumN(num);

	}

}
