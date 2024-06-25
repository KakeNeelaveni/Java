package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		
		list.add(10);
		list.add("hello");
		list.add('a');
		list.add(3.14);
		list.add("java");
		list.add('a');
		System.out.println(list);
		list.add(true);
		list.add(1,6);
		System.out.println(list);
		list.set(2, 4);
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.remove(1));
		System.out.println(list);
		list.add(null);
		System.out.println(list.contains("java"));
		System.out.println(list.get(4));
		System.out.println(list.indexOf('a'));
		System.out.println(list.lastIndexOf('a'));
		System.out.println(list.remove(3.14));
		System.out.println(list);
		
		List l=new ArrayList();
		System.out.println(l.isEmpty());
		l.add(l);
		l.add(2);
		l.add(3);
		System.out.println(l);
		l.addAll(list);
		System.out.println(l);
		System.out.println(l.iterator());
		
		/*List<Integer> arrlist=new ArrayList<Integer>();
		arrlist.addAll(list);
		System.out.println(arrlist);*/
		

	}

}
