//Write a program to search element in an array
package com.apjfsa;

import java.util.Scanner;

public class SearchingElement {

	public static void main(String[] args) {
		
		int arr[]= {10,20,46,78,45,23,34,56};
		
		System.out.println("Enter the number to search");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		boolean temp=false;
		
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				System.out.println("Number  found "+arr[i]+" at index"+i);
				temp=true;
				break;
			}
			
		}
		if(!temp)
			System.out.println("Number not found");
		
	}

}
