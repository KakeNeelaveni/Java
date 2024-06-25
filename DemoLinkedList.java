package com.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoLinkedList {

	public static void main(String[] args) {
	    LinkedList<Double> llist=new LinkedList();
		llist.add(5654.0);
		llist.add(98250.09);
		llist.add(34490.87);
		llist.add(23990.87);
		llist.add(67090.87);
		llist.add(89390.87);
		
		System.out.println(llist);
		System.out.println(llist.size());
		llist.remove(0);
		System.out.println(llist);
		llist.push(3487.90);
		System.out.println(llist);
		llist.push(10487.90);
		System.out.println(llist);
		llist.pop();
		System.out.println(llist);
		System.out.println(llist.peek());
		System.out.println(llist.peekLast());
		System.out.println(llist.poll());
		System.out.println(llist.pollFirst());
		System.out.println("---------------");
		
		Iterator<Double > itr=llist.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Max="+Collections.max(llist));
		System.out.println("Min="+Collections.min(llist));
		Collections.sort(llist);
		System.out.println(llist);
		
		Collections.reverse(llist);
		System.out.println(llist);

	}

}
