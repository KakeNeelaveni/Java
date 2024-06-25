//Write a program using Tree set to insert Country names.
package com.collections;
//importing TreeSet class from java.util package
import java.util.TreeSet;
//class declaration
public class DemoTreeSet {
    //main method
	public static void main(String[] args) {
		// Creating a TreeSet of String type
		TreeSet<String> cities=new TreeSet<String>();
		// Adding elements to TreeSet
		cities.add("Munnar");
		cities.add("Delhi");
		cities.add("Hyderabad");
		cities.add("Mumbai");
		cities.add("Paris");
		cities.add("Rome");
		cities.add("Paris");//trying to add duplicate
		//printing TreeSet
		System.out.println(cities);
		//printing in reverse order
		System.out.println(cities.descendingSet());
		//checking the value is present in TreeSet or not
		System.out.println(cities.contains("Itly"));
		//removing and printing
		System.out.println(cities.remove("Delhi"));
		//printing Current elements in the TreeSet
		System.out.println(cities);

	}

}
