package com.exe;

public class DemoThrow {

	void divide(int a, int b) throws ArithmeticException {
		if (b == 0)
			throw new ArithmeticException();
		int c = a / b;
		System.out.println("a/b=" + c);
	}

	char charStr(String s, int a) throws StringIndexOutOfBoundsException {
		if (a >= s.length())
			throw new StringIndexOutOfBoundsException();
		return s.charAt(a);
	}

	public static void main(String[] args) {

		DemoThrow d = new DemoThrow();
		try {
			d.divide(10, 0);

		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		try {
			d.charStr("Anudip", 6);
		}

		catch (StringIndexOutOfBoundsException se) {
			System.out.println(se);
		}

	}

}
