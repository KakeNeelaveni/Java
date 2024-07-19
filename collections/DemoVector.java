package com.collections;

import java.util.Vector;

public class DemoVector {

	public static void main(String[] args) {
		
		Vector<String> vector=new Vector<String>();
		
		vector.add("Apple");
		vector.add("Mango");
		vector.add("Orange");
		
		System.out.println(vector);
		System.out.println(vector.firstElement());
		System.out.println(vector.lastElement());
		vector.add("Banana");
		vector.add("Mango");
		vector.add(null);
		vector.set(3, "Grapes");
		System.out.println(vector);
		System.out.println(vector.capacity());
		System.out.println(vector.elementAt(4));
		System.out.println(vector.remove(3));
		System.out.println(vector);
		System.out.println(vector.set(4, " "));

	}
	

}
