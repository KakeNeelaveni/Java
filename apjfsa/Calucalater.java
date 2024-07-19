package com.apjfsa;

import java.util.Scanner;

public class Calucalater {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        boolean exit = false;

	        while (!exit) {
	            System.out.println("Select operation:");
	            System.out.println("1. Add");
	            System.out.println("2. Subtract");
	            System.out.println("3. Multiply");
	            System.out.println("4. Divide");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            
	            int choice = scanner.nextInt();

	            if (choice == 5) {
	                exit = true;
	                System.out.println("Exiting...");
	                break;
	            }

	            System.out.print("Enter first number: ");
	            double num1 = scanner.nextDouble();
	            System.out.print("Enter second number: ");
	            double num2 = scanner.nextDouble();
	            double result;

	            switch (choice) {
	                case 1:
	                    result = num1 + num2;
	                    System.out.println("Result: " + result);
	                    break;
	                case 2:
	                    result = num1 - num2;
	                    System.out.println("Result: " + result);
	                    break;
	                case 3:
	                    result = num1 * num2;
	                    System.out.println("Result: " + result);
	                    break;
	                case 4:
	                    if (num2 != 0) {
	                        result = num1 / num2;
	                        System.out.println("Result: " + result);
	                    } else {
	                        System.out.println("Error: Division by zero is not allowed.");
	                    }
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }

	            System.out.println(); // Print a blank line for better readability
	        }

	        scanner.close();
	    }
	}


