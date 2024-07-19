//Write a program to sort the array elements.
package com.apjfsa;
//class declaration
public class SortArray {
    //main method
	public static void main(String[] args) {
		//Initializing array
		int arr[]= {34,56,89,12,90,5,78};
		//local variables
		int i,j,temp;
		System.out.println("Sorted array is:");
		//comparing each element with other elements
		for( i=0;i<arr.length;i++) {
			for( j=i+1;j<arr.length;j++) {
				 temp=0;
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			//prints the sorted form of array
			System.out.println(arr[i]);
		}
		
		
		

	}

}
