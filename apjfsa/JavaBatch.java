//
package com.apjfsa;
//class declaration
public class JavaBatch {
    //main method
	public static void main(String[] args) {
		//object creation for DemoStudent class
		DemoStudent[] students=new DemoStudent[5];
		//Initializing values using object
		students[0]=new DemoStudent(1,"ram",20);
		students[1]=new DemoStudent(2,"sam",21);
		students[2]=new DemoStudent(3,"rao",25);
		students[3]=new DemoStudent(4,"nani",28);
		students[4]=new DemoStudent(5,"luna",26);
		//print students records
		int i;
		for(i=0;i<5;i++) {
			System.out.println(students[i]);
		}
		//using for each loop to print students records
		for(DemoStudent s:students)
			System.out.println(s);

	}

}
