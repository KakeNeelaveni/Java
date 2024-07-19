package com.apjfsa;

public class DemoArray {

	public static void main(String[] args) {
		//defining array
		int arr[]=new int[5];
		//assigning values
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		//accessing array elements
		for(int i=0;i<5;i++)//for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		
		System.out.println("array length="+arr.length);

	}

}
