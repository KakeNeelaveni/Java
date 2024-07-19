//Calculating students marks
package com.apjfsa;

public class StudentMarks {
    //main method
	public static void main(String[] args) {
		//defining array
		int marks[]=new int[5];
		//assigning values
		marks[0]=78;
		marks[1]=56;
		marks[2]=67;
		marks[3]=89;
		marks[4]=26;
		
		int total=0;//to store total marks
		boolean all_subpassed=true;//prints total marks
		float percentage;
		first://name of the loop
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
