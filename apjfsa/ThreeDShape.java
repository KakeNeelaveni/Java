package com.apjfsa;

public interface ThreeDShape {
	
	double volume();
	default void msg() {
		System.out.println("Default mathod");
	}
	static void call() {
		System.out.println("static mathod");
	}

}
