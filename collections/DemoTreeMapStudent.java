//Write a program using Tree Map for inserting the student objects with the roll number as key.
package com.collections;
//Importing necessary classes from the Java standard library
import java.util.Map;
import java.util.TreeMap;
//Defining the Student1 class
class Student1 {
	// Private member variables
    private int rollNumber;
    private String name;
    private int age;
    // Constructor to initialize the member variables
    public Student1(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }
    // Getter methods for the member variables
    public int getRollNumber() {
        return rollNumber;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    // Overriding the toString method to return a string representation of the object
    @Override
    public String toString() {
        return "Student[" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                ']';
    }
}
//class declaration
public class DemoTreeMapStudent {
    //main method
	public static void main(String[] args) {
		// Create a TreeMap to store Student1 objects with roll number as key
		TreeMap<Integer,Student1>studentMap=new TreeMap<Integer,Student1>();
		// Adding Student1 objects to the TreeMap
		studentMap.put(78, new Student1(78,"Ruby",20));
		studentMap.put(105, new Student1(105,"Luna",23));
		studentMap.put(43, new Student1(43,"Kalix",25));
		studentMap.put(167, new Student1(167,"JK",22));
		studentMap.put(34, new Student1(34,"Marvel",21));
		 // Iterating through the TreeMap and printing each entry
		 for (Map.Entry<Integer, Student1> entry : studentMap.entrySet()) {
	            System.out.println("RollNo:"+ entry.getKey() + ","+ entry.getValue());
	        }
	}

}
