package com.collections;
import java.util.HashMap;
public class DemoHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> cities=new HashMap<Integer,String>();
		cities.put(1, "Indore");
		
		cities.put(3, "Mumbai");
		cities.put(2, "Surat");
		cities.put(5, "Bhopal");
		cities.put(4, "Visakhapatnam");
		cities.put(6, null);
		cities.put(null, "Hydrabad");
		cities.putIfAbsent(6, "Mysore");
		System.out.println(cities);
		System.out.println(cities.keySet());
		System.out.println(cities.values());
		//System.out.println(cities.merge(6,"vijayawada",(oldvalue,newvalue) ->oldvalue+newvalue));
		System.out.println(cities);
		System.out.println(cities.containsKey(4));
		cities.replace(4,"Visakhapatnam", "Munnar");
		System.out.println(cities);
	}

}
