/* Write a program using Stack to store Cities based on
  literacy and retrieve the top city, and search   a city place in list.
 */
package com.collections;
//importing stack package
import java.util.Stack;
//class declaration
public class CitiesLiteracy {
    //main method
	public static void main(String[] args) {
		// Create a stack to hold the names of cities as strings
		Stack<String> stack = new Stack<String>();
		// Push cities onto the stack along with their literacy percentages as comments
		stack.push("Bangalore");// 88.5%
		stack.push("Mumbai");//89.7%
		stack.push("Shimla");// 94.1%
		stack.push("Agartala");// 94.45%
		stack.push("Thiruvanthapuram");// 96.5%
		stack.push("Kochi");// 97.5%
		stack.push("Aizawl");// 98.6%
		// Print the entire stack to show the order of cities
		System.out.println(stack);
		// Retrieve and print the top city from the stack
		System.out.println(stack.peek());
		// Search for a specific city ("Shimla") and print its position in the stack
		System.out.println(stack.search("Shimla"));

	}

}
