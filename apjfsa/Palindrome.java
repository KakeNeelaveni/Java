//program to find out given number is palindrome or not
package com.apjfsa;
//importing Scanner class from java.util package 
import java.util.Scanner;
//class declaration
public class Palindrome {
    //main method
	public static void main(String[] args) {
		//local variable
		int r,sum=0,temp;
		//reading number from console
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		temp=num;//temporary variable to store reverse number
		while(num>0) {
			r=num%10;
			sum=sum*10+r;
			num=num/10;
		}
		if(temp==sum)
			System.out.println(temp+" is a palindrome");
		else
			System.out.println(temp+" is not a palindrome");
		

	}

}
