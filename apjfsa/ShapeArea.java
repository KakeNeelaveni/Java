//write a program for method overloading
//overload method is area
package com.apjfsa;
//class declaration
public class ShapeArea {
	
	//area of rectangle
	double area(double length,double breadth) {
		double area=length*breadth;
		return area;
	}
	
	
	//area of circle
	double area(double radius,float pi) {
		double area=pi*radius*radius;
		return area;
		
	}
	//area of square
	double area(double side) {
		double area=side*side;
		return area;
		
	}
    //main method
	public static void main(String[] args) {
		//creating object for ShapeArea
		ShapeArea shape=new ShapeArea();
		//using object printing area of Rectangle,circle,square
		System.out.println("Area of Rectangle:"+shape.area(12,4.5));
		System.out.println("Area of circle:"+shape.area(5, 3.14f));
		System.out.println("Area of Square:"+shape.area(15));

	}

}
