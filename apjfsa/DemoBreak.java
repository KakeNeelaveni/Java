//Demonstration of break statement to withdraw amount with limit
package com.apjfsa;
//importing Scanner class from java.util package 
import java.util.Scanner;
//class declaration
public class DemoBreak {
     //main method
	public static void main(String[] args) {
		//local variables
		int withdrawamount,sumamt=0,Acbalance=120000,pin;
		//reading values from console
		Scanner sc=new Scanner(System.in);
		System.out.println("Insert card");
		while(Acbalance>0) {
		System.out.println("Enter amount to withdraw:");
		withdrawamount=sc.nextInt();
		System.out.println("Enter pin number");
		pin=sc.nextInt();
		sumamt+=withdrawamount;//sumamt=sumamt+amt
		Acbalance-=withdrawamount;
		if(sumamt>50000) {
			System.out.println("limit exceeded");
			break;
		}
		System.out.println("\nA/cBalance="+Acbalance+" Amount withdrawn:"+sumamt);


		}
	}

}
