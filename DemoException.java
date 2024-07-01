package com.exe;

//program using nested try-catch block
import java.util.TreeSet;

//class declaration
public class DemoException {
	// main method
	public static void main(String[] args) {
		// Define an array of integers
		int arr[] = { 1, 2, 4, 10 };

		// Outer try block to handle potential ArrayIndexOutOfBoundsException
		try {
			// Loop to print each element in the array
			for (int i = 0; i < 4; i++) {
				System.out.println(arr[i]);
			}

			// Nested try block to handle potential NullPointerException
			try {
				// Create a TreeSet and attempt to add a null value
				TreeSet<Integer> tset = new TreeSet<Integer>();
				tset.add(null); // This will throw a NullPointerException
			} catch (Exception e) {
				// Catch any exception that occurs in the nested try block
				System.out.println(e);
			}

		} catch (ArrayIndexOutOfBoundsException ie) {
			// Catch ArrayIndexOutOfBoundsException from the outer try block
			System.out.println(ie.getMessage());
		} finally {
			// This block will always execute, regardless of an exception occurring
			System.out.println("Finally");
		}
	}
}
