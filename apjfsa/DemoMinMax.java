//Write a program to find the maximum and minimum values from an array
package com.apjfsa;

public class DemoMinMax {
    //main method
	public static void main(String[] args) {
		//Initializing array
		int arr[]= {12,34,9,16,56};
		//local variables
		int min ,max;
		min=max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			//to find min value
			if(min>arr[i])
				min=arr[i];
			//to find max value
			if(max<arr[i])
				max=arr[i];
		}
		
		//prints minimum and maximum value
		System.out.println("maximum value:"+max+"\nminimum value:"+min);

	}

}
