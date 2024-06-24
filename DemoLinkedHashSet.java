//Write a program demonstrating Linked Hash Set
package com.collections;
//importing package
import java.util.LinkedHashSet;
//class declaration
public class DemoLinkedHashSet {
    //main method
	public static void main(String[] args) {
		// Creating a LinkedHashSet of Integer type
		LinkedHashSet<Integer> lhashset=new LinkedHashSet<Integer>();
		// Adding elements to the LinkedHashSet
		lhashset.add(78);
		lhashset.add(56);
		lhashset.add(23);
		lhashset.add(90);
		lhashset.add(34);
		lhashset.add(78);//trying to add duplicate
		lhashset.add(null);//adding null value
		lhashset.add(null);
	    // Printing the LinkedHashSet
		System.out.println(lhashset);
		// Printing the size of the LinkedHashSet
		System.out.println(lhashset.size());
		// Removing an element from the LinkedHashSet
		System.out.println(lhashset.remove(90));
		// Printing the LinkedHashSet after removal
		System.out.println(lhashset);
		// Checking if the LinkedHashSet contains null value
		System.out.println(lhashset.contains(null));

	}

}
