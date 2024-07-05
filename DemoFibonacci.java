package com.exe;

//Fibonacci class to generate Fibonacci series
class Fibonacci {
	int limit;// Limit for the number of Fibonacci numbers to generate
	int n1 = 0;// First Fibonacci number
	int n2 = 1; // Second Fibonacci number
	int n3;// Variable to hold the next Fibonacci number in the series
	// Constructor to initialize the limit

	public Fibonacci(int limit) {
		super();
		this.limit = limit;
	}

	// Synchronized method to generate and print the Fibonacci series
	synchronized void series() {
		// Print the first Fibonacci number if it's the first in the series
		if (n1 == 0)
			System.out.println(n1);
		// Print the second Fibonacci number if it's the second in the series
		if (n2 == 1)
			System.out.println(n2);
		// Loop to generate the rest of the Fibonacci series up to the limit
		for (int i = 2; i < limit; i++) {
			n3 = n1 + n2;// Calculate the next Fibonacci number
			n1 = n2;// Update n1 to the next value
			n2 = n3;// Update n2 to the next value
			// Sleep for 500 milliseconds to simulate processing time
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Print the next Fibonacci number
			System.out.println(n3);

		}
	}

}

//DemoFibonacci class extends Thread to run the Fibonacci series in a thread
public class DemoFibonacci extends Thread {
	Fibonacci fb;// Reference to the Fibonacci instance

	// Constructor to initialize the Fibonacci instance
	public DemoFibonacci(Fibonacci fb) {
		super();
		this.fb = fb;
	}

	// Run method to start the series method of Fibonacci instance
	public void run() {
		fb.series();
	}

	// Main method to start the application
	public static void main(String[] args) {
		int limit = 5;// Set the limit for the Fibonacci series
		Fibonacci fs = new Fibonacci(limit);// Create a new Fibonacci instance
		// Create and start three threads to run the Fibonacci series
		DemoFibonacci dfb = new DemoFibonacci(fs);
		dfb.start();
		DemoFibonacci dfb1 = new DemoFibonacci(fs);
		dfb1.start();
		DemoFibonacci dfb2 = new DemoFibonacci(fs);
		dfb2.start();

	}

}
