//Write a program demonstrating PriorityQueue.
package com.collections;
//importing package PriorityQueue
import java.util.PriorityQueue;
//class declaration
public class DemoPreQueue {
    //main method
	public static void main(String[] args) {
		// Create a PriorityQueue object of type Integer
		PriorityQueue<Integer> pqueue=new PriorityQueue<Integer>();
		// Add elements to the priority queue
		pqueue.add(10);
		pqueue.add(45);
		pqueue.add(2);
		pqueue.add(89);
		pqueue.add(56);
		// Print the current state of the priority queue
		System.out.println(pqueue);
		// Add another element to the priority queue
		pqueue.add(5);
		// Print the current state of the priority queue
		System.out.println(pqueue);
		// Use peek() to get the smallest element without removing it
		System.out.println(pqueue.peek());
		// Use poll() to remove and return the smallest element
		System.out.println(pqueue.poll());
        // Print the current state of the priority queue after removal
		System.out.println(pqueue);
		// Use size() to get the number of elements in the priority queue
		System.out.println(pqueue.size());
		// Use isEmpty() to check if the priority queue is empty
		System.out.println(pqueue.isEmpty());

	}

}
