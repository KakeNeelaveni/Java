//Write a program using Array Deque using String and demonstrate methods of ArrayDeque
package com.collections;
//importing ArrayDeque
import java.util.ArrayDeque;
//class declaration
public class DemoArrDque {
    //main method
	public static void main(String[] args) {
		// Create an ArrayDeque object of type String
		ArrayDeque<String> dqueue=new ArrayDeque<String>();
		// Use push() to add elements at the beginning of the deque
		dqueue.push("Ram");
		dqueue.push("Sitha");
		dqueue.push("Arjun");
		dqueue.push("Naveen");
		// Print the current deque
		System.out.println(dqueue);
		// Use addFirst() to add an element at the beginning of the deque
		dqueue.addFirst("Hari");
		// Use offerLast() to add an element at the end of the deque
		dqueue.offerLast("Adi");
		// Use add() to add an element at the end of the deque
		dqueue.add("Bunny");
		// Print the current deque
		System.out.println(dqueue);
		// Use peekFirst() to get the first element without removing it
		System.out.println(dqueue.peekFirst());
		// Use peekLast() to get the last element without removing it
		System.out.println(dqueue.peekLast());
		// Use pollFirst() to remove and return the first element
		System.out.println(dqueue.pollFirst());
		// Print the current state of the deque
		System.out.println(dqueue);
		// Use pollLast() to remove and return the last element
		System.out.println(dqueue.pollLast());
		// Use getFirst() to get the first element without removing it
		System.out.println(dqueue.getFirst());
		// Use pop() to remove and return the first element
		System.out.println(dqueue.pop());
		// Print the current state of the deque
		System.out.println(dqueue);

	}

}
