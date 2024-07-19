package com.apjfsa;

import java.util.Scanner;

public class AtmDemo {

	public static void main(String[] args) {
		
		int balance=200000,withdraw,deposit;
		System.out.println("Insert card");
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.Check Balance\n2.Withdraw\n3.Deposit\n4.EXIT");
			System.out.println("Choose the option");
			int n=sc.nextInt();
			System.out.println("Enter pin");
			int pin=sc.nextInt();
		
		switch(n) {
		case 1:
			
			System.out.println("Balance="+balance);
			System.out.println("==================");
			break;
		case 2:
			if(balance>=0) {
				System.out.println("Enter amount to withdraw:");
				withdraw=sc.nextInt();
				int sumAmount=0;
				sumAmount+=withdraw;
				balance-=withdraw;
				if(sumAmount>50000) {
					System.out.println("limit exceeded");
				    break;
				}
				System.out.println("collect cash");
			}
			else
				System.out.println("Insufficient Balance");
			System.out.println("==================");
			break;
		case 3:
			System.out.println("Enter amount to deposit:");
			deposit=sc.nextInt();
			
			balance+=deposit;
			System.out.println("Amount deposited successfully");
			System.out.println("==================");
			break;
		case 4:
			System.exit(0);
			
		 }
		}
	}

}
