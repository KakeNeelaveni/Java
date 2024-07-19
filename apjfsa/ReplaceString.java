/*.Write a method that takes a String and returns a String of the same length containing the 'X' 
  character in all positions except the last 4 positions. The characters in the last 4 positions
   must be the same as in the original string.
    For example, if the argument is "12345678", the return value should be "XXXX5678".*/
package com.apjfsa;
//importing scanner class
import java.util.Scanner;
//class declaration
public class ReplaceString {
	//method to replace the characters with 'x' except last 4 characters
	String replaceStr(String s) {
		// Convert the string to a character array
		char arr[]=new char[s.length()];
		arr=s.toCharArray();
		//loop to replace characters with 'x' except last 4 characters
		for (int i=0;i<arr.length-4;i++) {
			arr[i]='x';
			
		}
		//converting character array to string
		String str1=new String(arr);
		return str1;
	}
	//main method
	public static void main(String args[]) {
		//taking user input
		System.out.println("Enter your mobilenumber:");
		//Scanner class to read values from console
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		//object creation for class ReplaceString
		ReplaceString rp=new ReplaceString();
		//Calling replaceStr method and printing the result
		System.out.println(rp.replaceStr(str));
	}

}
