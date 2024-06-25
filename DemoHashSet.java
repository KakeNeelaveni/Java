package com.collections;

import java.util.HashSet;

public class DemoHashSet {

	public static void main(String[] args) {
		HashSet<String> coursesnames=new HashSet<String>();
		coursesnames.add(null);
		coursesnames.add("Python");
		coursesnames.add("C");
		coursesnames.add("Java");
		coursesnames.add("Dot Net");
		coursesnames.add("DBMS");
		coursesnames.add("Python");
		coursesnames.add(null);
		
		System.out.println(coursesnames);
		for(String s:coursesnames)
			System.out.println(s+" and");
		System.out.println(coursesnames.size());
		System.out.println(coursesnames.remove(null));
		System.out.println(coursesnames);
		

	}

}
