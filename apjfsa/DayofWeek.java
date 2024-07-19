package com.apjfsa;

import java.util.Scanner;

public class DayofWeek {
	
	static void printday(int d) {
		switch(d) {
		case 1:System.out.println("sunday");
		       break;
		case 2:System.out.println("Monday");
	       break;
		case 3:System.out.println("tuesday");
	       break;  
		case 4:System.out.println("thursday");
	       break; 
		case 5:System.out.println("wednesday");
	       break;
		case 6:System.out.println("friday");
	       break;   
		case 7:System.out.println("saturday");
	       break;
	    default:System.out.println("week has only 7 days");
	     
		}
	}

	public static void main(String[] args) {
		 
		int dayNo;
		System.out.println("Enter a day number");
		Scanner sc= new Scanner(System.in);
		dayNo=sc.nextInt();
		printday(dayNo);
		printday(5);

	}

}
