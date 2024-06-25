package com.collections;

import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {
		// Create a new stack that holds Integer objects
		Stack<Integer> stack=new Stack<Integer>();
		// Push elements onto the stack
		stack.push(19);
		stack.push(34);
		stack.push(98);
		stack.push(23);
		// Adds 50 to the stack (equivalent to push)
		stack.add(50);
		// Print the entire stack
		System.out.println(stack);
		// prints (Peek) at the top element of the stack without removing it
		System.out.println(stack.peek());
		// Pop the top element from the stack and print it
		System.out.println(stack.pop());
		System.out.println(stack);
		// Search for an element in the stack
		System.out.println(stack.search(98));// Output: 2 (1-based position from the top)
	
		
	}

}
