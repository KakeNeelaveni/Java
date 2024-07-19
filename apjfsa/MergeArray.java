// Write a program to merge to given arrays and print
package com.apjfsa;
//class declaration
public class MergeArray {
    //Main method
	public static void main(String[] args) {
		//Initialize arrays
		int arr1[]= {2,4,6,8,10};
		int arr2[]= {3,5,7,9};
		int a=arr1.length;
		int b=arr2.length;
		//size of third array
		int c=a+b;
		//creating third array
		int arr3[]=new int[c];
		//to store the elements of arr1 to third array
		for(int i=0;i<arr1.length;i++){
			arr3[i]=arr1[i];
		}
		//to  concatenate the elements of arr2 to third array
		for(int i=0;i<arr2.length;i++) {
			arr3[a+i]=arr2[i];
		}
		//to print the resultant array
		for(int i=0;i<c;i++) {
			System.out.println(arr3[i]);
		}

	}

}
