//Write a program to sort array elements using Bubble sort
package com.apjfsa;
//class declaration
public class BubbleSort {
	// Main method
	public static void main(String[] args) {
		//Initialize array
		int arr[]= {3,2,8,7,6};
		//local variables
		int i,j,temp;
		//perform bubble sort
		for(i=0;i<arr.length-1;i++) {
			for(j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					//swapping logic
					 temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			
			}
			
		}
		//print the sorted array
		System.out.println("Sorted array:");
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
        
	}

}
