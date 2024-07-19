package com.apjfsa;

public interface Shapes {
	
	final float pi=3.14f;
	
	int area();
	int perimeter();
	default int surfacearea() {
		System.out.println("surfacearea");
		return 0;
	}
	static void msg() {
		System.out.println("static method");
	}

}
