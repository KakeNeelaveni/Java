//program to print fibonacci series 
package com.apjfsa;
//importing Scanner class from java.util package
import java.util.Scanner;
//class declaration
public class FibonacciSeries {
    //main method
	public static void main(String[] args) {
		 //local variables
		int num1,num2,num3,range;
		num1=0;
		num2=1;
		System.out.println("Enter range:");
		//reading values from console
		Scanner sc= new Scanner(System.in);
		range=sc.nextInt();
		System.out.print(num1+" "+num2);
		int i=3;
		while(i<=range) {
			num3=num1+num2;
			System.out.print(" "+num3);
			//swapping numbers
			num1=num2;
			num2=num3;
			i++;
			
		}
		

	}

}
