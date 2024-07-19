//Write a Program to find the duplicate elements in the array and print the count.
package com.apjfsa;
//class declaration
public class DuplicateNumArr {
    //main method
	public static void main(String[] args) {
		//Initializing array
		int arr[]= {12,67,45,89,13,15,12,67,89};
		//local variables
		boolean duplicate=false;
		int count=0;
		System.out.println("Duplicate numbers are:");
		//check the duplicates
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					//prints the duplicates
					System.out.println(arr[j]);
					duplicate=true;
					count++;
					}
			}
		}
		//printing count of the duplicates
		System.out.println("No.of duplicate numbers="+count);
		if(!duplicate) {
			System.out.println("There is no duplicate numbers");
		}
			
		
	}

}
