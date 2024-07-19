package com.collections;

import java.util.TreeMap;

public class DemoTreeMap {

	public static void main(String[] args) {
		
		TreeMap<Double,String> tmap=new TreeMap<Double,String>();
		
		tmap.put(5.6, "Developer");
		tmap.put(0.3, "Tester");
		tmap.put(4.9, "Tech Support");
		tmap.put(1.8, "Data Analyst");
		tmap.put(2.7, "Web Developer");
		tmap.put(-8.4,null );
		System.out.println(tmap);
		System.out.println(tmap.firstKey());
		System.out.println(tmap.lastEntry());
		System.out.println(tmap.descendingMap());
		System.out.println(tmap.replace(-8.4, null));
		System.out.println(tmap.floorKey(1.7));
		System.out.println(tmap.ceilingKey(3.6));

	}

}
