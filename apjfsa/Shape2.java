package com.apjfsa;

abstract public class Shape2 {
	String name;
	
	public Shape2(String name) {
		super();
		this.name=name;
	}
	
	void shapeInfo() {
		System.out.println("Name of Shape:"+name);
	}
	
	//abstract void area();
	void area() {
		System.out.println("Area of Shape");
	}

}
