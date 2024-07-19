package com.apjfsa;

import java.util.Scanner;

public class DemoReplaceString {

	public static void main(String[] args) {
		
		//String number="12345678";
		//System.out.println(number.replace("1234", "xxxx"));
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		String number=sc.next();
		char arr[]=new char[number.length()];
		arr=number.toCharArray();
		
		for(int i=0;i<arr.length-4;i++) {
			
			arr[i]='x';
			
		}
		//String number1=new String(arr);
		//System.out.println(number1);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
			
			
		
		
	}
	

}
