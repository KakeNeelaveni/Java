package com.apjfsa;

public class VotingAgeCheck {
	
	 
	//main method
    public static void main(String[] args) {
        //Declaring variables
    	int age = 25;
        int vAge = 18;

        // Compare age and voting age
        if (age >= vAge) {
            System.out.println("Old enough to vote!");
        }
        else {
            System.out.println("Not old enough to vote.");
        }
    }
}
