package com.other;

//class declaration
public class NumberPattern {
	// main method
	public static void main(String[] args) {
		// local variable
		int rows = 5; // Number of rows in the pattern
		// logic
		FirstForLoop: for (int i = rows; i > 0; i--) {
			SecondForLoop: for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}