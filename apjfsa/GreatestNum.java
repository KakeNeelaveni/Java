//program to find the greatest number of given two numbers

package com.apjfsa;

import java.util.Scanner;

public class GreatestNum {
	//non static instance method
	 int greatestNum(int n1,int n2){
	    if(n1>n2)
	     return n1;
	     else
	       return n2;
	}
	 
	/*//instance method
	void CheckNum(int x,int y) {
		if(x>y)
			System.out.println(x+"is greater");
		else
			System.out.println(y+"is greater Number");
	}*/

	public static void main(String[] args) {
		
		System.out.println("Enter two numbers:");
		//local variable
		int num1,num2;
		
		//reading values from console
		Scanner sc = new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		//object creation for GreatestNum
		GreatestNum gn=new GreatestNum();
		//gn.CheckNum(num1, num2);
		//int max=gn.greatestNum(num1, num2);
		System.out.println(gn.greatestNum(num1,num2)+" is the greatest number");

	}

}
