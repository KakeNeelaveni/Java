/*Write a program to create collection of student objects 

 a. Use comparable interface to define compareTo

 b. sort Student Object based on name and display the object before and after sorting*/
package com.collections;
//Importing necessary classes from the Java standard library
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Defining the Student class which implements the Comparable interface
class Student implements Comparable<Student> {
	// Member variables to store student details
	int studentId;
	String studentName;
	String qualification;
	// Constructor to initialize the member variables
	public Student(int studentId, String studentName, String qualification) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.qualification = qualification;
	}
	// Overriding the toString method to return a string representation of the student object
		
	@Override
	public String toString() {
		
		return "Student [studentId="+studentId+",studentName="+studentName+",qualification="+qualification+"]";
	}
	// Implementing the compareTo method to compare Student objects based on their names
	@Override
	public int compareTo(Student o) {
		if(this.studentName.compareTo(o.studentName)>0)
			return 1;
		else if(this.studentName.compareTo(o.studentName)<0)
			return -1;
		else
		    return 0;
		//return this.studentId-o.studentId;
	}
	
	
	

}

//Public class containing the main method

public class StudentCollection {
    //main method
	public static void main(String[] args) {
    // Creating a list to store Student objects
	List<Student> list	=new ArrayList<Student>();
	// Adding Student objects to the list
	list.add(new Student(124,"Deepa","Bsc"));
	list.add(new Student(211,"Arya","Bcom"));
	list.add(new Student(432,"Divya","Btech"));
	list.add(new Student(100,"Sam","BE"));
	// Creating and adding another Student object to the list
	Student s=new Student(411,"Fizal","BCA");
	list.add(s);
	// Printing the list of students before sorting
	for(Student s1:list) {
	   System.out.println(s1);
	}
	// Sorting the list of students based on their names
	 System.out.println("After Sorting:");
	Collections.sort(list);
	// Printing the list of students after sorting
	for(Student s1:list) {
		
		   System.out.println(s1);
		}

	}

}
