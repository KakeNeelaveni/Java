package com.collections;

import java.util.ArrayDeque;

public class DemoDequeue {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> dqueue=new ArrayDeque<Integer>();
		
		dqueue.push(23);
		dqueue.push(56);
		dqueue.push(12);
		dqueue.push(89);
		dqueue.push(43);
		System.out.println(dqueue);
		dqueue.add(75);
		dqueue.addFirst(43);
		dqueue.offerFirst(63);
		System.out.println(dqueue);
		System.out.println(dqueue.peekFirst());
		System.out.println(dqueue.peekLast());
		System.out.println(dqueue.pollFirst());
		System.out.println(dqueue);
		System.out.println(dqueue.pollLast());
		System.out.println(dqueue);
		System.out.println(dqueue.pop());
		System.out.println(dqueue);
		
	}

}
