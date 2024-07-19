package com.apjfsa;
//class declaration
public class Circle {
	//instance variable
	int radius;
	float PI=3.14f;
	//instance method
	void area() {
		System.out.println("area of circle is "+(PI*radius*radius));
	}
	void perimeter() {
		System.out.println("perimeter of circle is "+(2*PI*radius));
	}

	public static void main(String[] args) {
		//object creation for circle
		Circle c=new Circle();
		c.radius=2;
		c.area();
		c.perimeter();

	}

}
