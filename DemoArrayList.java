/*Write a program demonstrating Array List for inserting integer
values and retrieve it, get index and get the last index of methods.*/
package com.collections;
//importing package
import java.util.ArrayList;
//class declaration
public class DemoArrayList {
    //main method
	public static void main(String[] args) {
		// Create a new ArrayList that holds Integer objects
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		 // Add elements to the ArrayList
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		arrayList.add(60);
		// Print the entire ArrayList
		System.out.println(arrayList);
		// Get and print the element at index 5
		System.out.println(arrayList.get(5));
		// Attempt to find the last index of the ArrayList itself within the ArrayList
        // This will always return -1 since the ArrayList does not contain itself
		System.out.println(arrayList.lastIndexOf(arrayList));
		// Check if the ArrayList is empty and print the result
		System.out.println(arrayList.isEmpty());
		// Remove the element at index 1 and print the removed element
		System.out.println(arrayList.remove(1));
		// Check if the ArrayList contains the element 50 and print the result
		System.out.println(arrayList.contains(50));

	}

}
