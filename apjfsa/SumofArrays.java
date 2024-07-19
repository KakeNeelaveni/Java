package com.apjfsa;

public class SumofArrays {

	public static void main(String[] args) {
		
		int arr1[][]= {{1,2},{3,4}};
		int [][]arr2= {{2,5},{5,6}};
		int i,j = 0;
		
		int[][] resultArray = new int[2][2];

        for ( i = 0; i < 2; i++) {
            for ( j = 0; j < 2; j++) {
               
                resultArray[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(resultArray[i][j]+" ");
            }
            System.out.println();
        }
        
	}

}
