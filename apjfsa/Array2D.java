package com.apjfsa;

public class Array2D {

	public static void main(String[] args) {
		
		int [][] arr=new int[2][2];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[1][0]=30;
		arr[1][1]=40;
		
		
		int i,j;
		for(i=0;i<arr.length;i++)//row
			{
			for(j=0;j<arr.length;j++)//column 
				{
				System.out.print(arr[i][j]+" ");
			    }
			System.out.println();
		}
		
		int[][] arr1= {{1,2,3},{2,3,4}};
		
		System.out.println("No .of rows in arr1="+arr1.length);
		System.out.println("No .of columns in arr1="+arr1[0].length);
	}
}
