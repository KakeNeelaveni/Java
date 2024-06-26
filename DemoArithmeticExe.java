package com.exe;

//class declaration
public class DemoArithmeticExe {
	// main method
	public static void main(String[] args) {
		// local variables
		int a, b, c;
		// assigning values to variables
		a = 23;
		b = 1;
		System.out.println("Start of the program");
		// statements which raise exception return in try block
		try {
			c = a / b;
			System.out.println("c=" + c);
			// System.out.println("End of program");

			int arr[] = { 1, 2, 3 };
			System.out.println(arr[4]);
		} catch (ArithmeticException ae) {
			System.out.println("Exception caught");
		} catch (ArrayIndexOutOfBoundsException ie) {
			System.out.println(ie.getMessage());
		} finally {
			System.out.println("End of program");
		}

	}

}
