package com.collections;

import java.util.LinkedHashMap;
//class declaration
public class DemoLinkedHashMap {
    //main method
	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer> countrycodes=new LinkedHashMap<String,Integer>();
		
		countrycodes.put("USA",1 );
		countrycodes.put("India",91 );
		countrycodes.put("Russia",7 );
		countrycodes.put("Australia",61 );
		countrycodes.put("China",86 );
		countrycodes.put("Pakisthan",92);
		
		countrycodes.put(null,0);
		
		System.out.println(countrycodes);
		System.out.println(countrycodes.values());
		System.out.println(countrycodes.keySet());
		System.out.println(countrycodes.remove("Pakisthan", 92));
		countrycodes.putIfAbsent("korea",82);
		System.out.println(countrycodes);
		

	}

}
