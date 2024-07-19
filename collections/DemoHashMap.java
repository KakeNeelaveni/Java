//Write a program using  Hash Map insert Country with its codes as key.
package com.collections;
//importing HashMap class from java.util package
import java.util.HashMap;
//class declaration
public class DemoHashMap {
    //main method
	public static void main(String[] args) {
		// Create a HashMap to store cities with Integer keys and String values
		HashMap<Integer,String> cities=new HashMap<Integer,String>();
		// Adding key-value pairs to the HashMap
		cities.put(1, "Indore");
		cities.put(3, "Mumbai");
		cities.put(2, "Surat");
		cities.put(5, "Bhopal");
		cities.put(4, "Visakhapatnam");
		cities.put(7,"Bengaluru");
		cities.put(6, null);// Adding a null value
		cities.put(null, "Hydrabad");// Adding a null key
		// Using putIfAbsent method to add a key-value pair
		cities.putIfAbsent(6, "Mysore");
		// Print the entire HashMap
		System.out.println(cities);
		// Print all the keys in the HashMap
		System.out.println(cities.keySet());
		// Print all the values in the HashMap
		System.out.println(cities.values());
		// Using merge method to combine the values of a key
		System.out.println(cities.merge(7," vijayawada",(oldvalue,newvalue) ->oldvalue+newvalue));
		System.out.println(cities);
		// Check if a specific key is present in the HashMap
		System.out.println(cities.containsKey(4));
		// Replace the value of a specific key if it is currently mapped to a given value
		cities.replace(4,"Visakhapatnam", "Munnar");
		// Print the final state of the HashMap
		System.out.println(cities);
	}

}
