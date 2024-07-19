package com.apjfsa;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		int i,num;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(i=1;i<=10;i++) {
			
			System.out.println(num+"*"+i+"="+num*i);
		}

	}

}
