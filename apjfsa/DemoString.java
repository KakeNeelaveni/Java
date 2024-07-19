//Write a program to define a String object and demonstrate  multiple methods of String.
package com.apjfsa;
//class declaration
public class DemoString {
    //main method
	public static void main(String[] args) {
		//String declaration using a literal
		String name="Anudip";
		
		System.out.println(name);
		//defining String using constructor
		String course =new String("APJFSA Course");
		System.out.println(course);
		
		char[] courseType= {'a','w','s'};
		//defining String using character array
		String course1=new String(courseType);
		
		System.out.println(course1);
		 // Concatenating two strings
		System.out.println(name.concat("Foundation"));
		//reassigning the value of name variable
		name="Anudip Foundation";
		System.out.println(name);
		// printing the character at a specific index
		System.out.println(name.charAt(15));
		//index of the first occurrence of a character
		System.out.println(name.indexOf('n'));
		//index of the last occurrence of a character
		System.out.println(name.lastIndexOf('n'));
		//the index of the first occurrence of a character from a specific index
		System.out.println(name.indexOf('n', 2));
		//length of string
		System.out.println(name.length());
		//Checking if the string contains another string
		System.out.println(name.contains(course));//false
		System.out.println(name.indexOf('c'));
		System.out.println(name.equals(course1));
		System.out.println(name.compareTo(course1));
		
		String name1="Anudip foundation";
		System.out.println(name.compareTo(name1));
		System.out.println(name.compareToIgnoreCase(name1));
	   // Checking if two strings are equal (ignores the case)
		System.out.println(name.equalsIgnoreCase(name1));
		 // Converting the string to lowercase
		System.out.println(name.toLowerCase());
		 // Converting the string to uppercase
		System.out.println(name.toUpperCase());
		
		
	}

}
