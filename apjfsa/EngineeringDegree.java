package com.apjfsa;

public class EngineeringDegree extends Graduation {
	
	String branchName;
	int no_ofSubjects;
	int coursefee;

	public EngineeringDegree(String courseName, int no_ofyears,String branchName,int no_ofSubjects) {
		super(courseName, no_ofyears);
		this.branchName=branchName;
		this.no_ofSubjects=no_ofSubjects;
	}
	
	void courseDetails(int fee) {
		coursefee=fee;
		super.coursefee=fee;
		super.courseDetails();
		System.out.println("Engineering Degree details:Branch Name:"+branchName+",No_of Subjects:"+no_ofSubjects);
	}

	public static void main(String[] args) {
		EngineeringDegree btech=new EngineeringDegree("Btech",4,"CSE",6);
		btech.courseDetails(10000);
		
	}

}
