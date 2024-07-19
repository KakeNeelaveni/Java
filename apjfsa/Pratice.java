package com.apjfsa;

import java.util.Scanner;

public class Pratice {

	public static void main(String[] args) {
		//local variables
				int n,Acbalance=120000,withdrawamount,sumamt=0,pin,deposit;
				System.out.println("Insert card");
				while(true) {
				System.out.println("1.Check Balance\n2.Withdraw\n3.Deposit\n4.Exit");
				Scanner sc=new Scanner(System.in);
				System.out.println("Select option");
				n=sc.nextInt();
				System.out.println("Enter pin number");
				pin=sc.nextInt();
				switch(n)
				{
				case 1:
					System.out.println("\nBalance="+Acbalance);
					System.out.println("==================");
					break;
				case 2:
					while(Acbalance>0) {
						System.out.println("Enter amount to withdraw:");
						withdrawamount=sc.nextInt();
						
						sumamt+=withdrawamount;
						Acbalance-=withdrawamount;
						if(sumamt>50000) {
							System.out.println("limit exceeded");
							break;
						}
						System.out.println("\nA/cBalance="+Acbalance+" Amount withdrawn:"+sumamt);
						

						}
					break;
				case 3:
					System.out.println("Enter amount to deposit:");
					deposit=sc.nextInt();
					
					Acbalance+=deposit;
					System.out.println("Amount deposited successfully");
					
					break;
				case 4:
					System.exit(0);

				}
				
			   }
				
	}

}
