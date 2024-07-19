//Write a program to find the result of a student using marks as array.
package com.apjfsa;

import java.util.Scanner;

public class DemoStudents {
    //main method
	public static void main(String[] args) {
		//defining array
		int marks[]=new int[5];
		
		first://loop name
			//to read marks from console
		for(int i=0;i<5;i++){
		System.out.println("Enter the marks:");
		Scanner sc=new Scanner(System.in);
		marks[i]=sc.nextInt();
	    }
		
		int total=0;//to store total marks
		boolean all_subpassed=true;//prints total marks
		float percentage;
		Second://name of the loop
		for(int i=0;i<5;i++) {
		   if(marks[i]<35) {
			   all_subpassed=false;
		   }
			 total+=marks[i];
		}
		
		// Print the result based on whether the student passed all subjects
		if(all_subpassed) {
			percentage=total/5;
			System.out.println("Student passed in all subjects"+"\nTotal marks="+total+"\npercentage="+percentage);
		}
		else 
			System.out.println("Student Failed");
	}

}
