package com.apjfsa;

import java.util.Scanner;

public class Month {
	
	static void monthNum(int num) {
		switch(num) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Given month has 31 days");
	       break;
	    case 2:System.out.println("february has 28 days");
           break;
	   
	    case 4:
	    case 6:
	    case 9:
	    case 11:
	    	System.out.println("Given month has 30 days");
           break; 
	    
        
        default:System.out.println("year has only 12 months");
		}
		}

	public static void main(String[] args) {
		int monNo;
		System.out.println("Enter month number");
		Scanner sc= new Scanner(System.in);
		monNo=sc.nextInt();
		monthNum(monNo);

	}

}
