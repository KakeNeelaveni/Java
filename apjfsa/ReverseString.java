//Write a Program to reverse a given String value using String Object
package com.apjfsa;
//importing Scanner class
import java.util.Scanner;
//class declaration
public class ReverseString {
    //main method
	public static void main(String[] args) {
		//String str="Neelaveni";
		
		System.out.println("Enter the String:");
		//reading values from console
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		//Converting string to character array
		char ch[]=str.toCharArray();
		 // Print the original string
		System.out.println("original String");
		for (int i = 0; i < ch.length; i++) {  
            System.out.print(ch[i] + " ");  
        }
		// Print the reversed string
		System.out.println("\nReversed String");
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]+" ");
		}

	}

}
