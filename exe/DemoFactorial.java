/*Write a program to calculate Factorial of a number using a method which will
allow one thread for executing at a time.*/
package com.exe;
//Factorial class calculates the factorial of a number
class Factorial {
	int num;// The number for which the factorial is to be calculated
	// Constructor to initialize the number

	public Factorial(int num) {
		super();
		this.num = num;
	}

	// Method to calculate and print the factorial
	void fact() {
		int factorial = 1;
		// Synchronize the block to ensure thread safety
		synchronized (this) {
			for (int i = 1; i <= num; i++) {
				factorial = factorial * i;// Calculate factorial

				System.out.println(factorial);// Print the intermediate factorial value
				try {
					// Pause for 500 milliseconds
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// Print the stack trace if an interruption occurs
					e.printStackTrace();
				}

			}
		}

	}
}

//DemoFactorial class extends Thread to run factorial calculation in a separate thread
public class DemoFactorial extends Thread {
	Factorial fac;// Reference to the Factorial object
	// Constructor to initialize the Factorial object

	public DemoFactorial(Factorial fac) {
		super();
		this.fac = fac;
	}

	// Run method to start the factorial calculation
	public void run() {
		fac.fact();
	}

	// Main method to start the program
	public static void main(String args[]) {
		int num = 5; // Number for which the factorial is to be calculated
		Factorial f = new Factorial(num);// Create a Factorial object
		// Create three DemoFactorial threads with the same Factorial object
		DemoFactorial f2 = new DemoFactorial(f);
		f2.start();

		DemoFactorial f3 = new DemoFactorial(f);
		f3.start();
		DemoFactorial f4 = new DemoFactorial(f);
		f4.start();
	}

}
