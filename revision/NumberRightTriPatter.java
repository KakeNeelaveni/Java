package com.revision;

//class declaration
public class NumberRightTriPatter {
	// main method
	public static void main(String[] args) {
		// local variable
		int rows = 5;
		// printing logic
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
