//program to demonstrating class and object

package com.apjfsa;
//class declaration
public class Student {
	//instance variable
	int sno;
	float GPA;
	String name,course;
	//instance method
    void details() {
    	System.out.println("Student_number="+sno);
    	System.out.println("Student_name="+name);
    	System.out.println("Student_course="+course);
    	System.out.println("Student_GPA="+GPA);
    }
    //main method
	public static void main(String[] args) 
	{
		//object creation for Student
		Student s=new Student ();
		s.sno=1;
		s.name="Luna";
		s.course="MCA";
		s.GPA=9.8f;
		s.details();
				
	}

}
