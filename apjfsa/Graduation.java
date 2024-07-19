package com.apjfsa;

public class Graduation {
	
	String courseName;
	int no_ofyears;
	int coursefee;
	 
	
	public Graduation(String courseName, int no_ofyears) {
		super();
		this.courseName = courseName;
		this.no_ofyears = no_ofyears;
	}
	
	void courseDetails() {
		System.out.println("Course details:"+courseName+" "+no_ofyears+"fee"+coursefee);
	}

	
		
	}
	


