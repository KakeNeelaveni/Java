//program using single level inheritance
package com.apjfsa;
//super class
public class Shape {
	
    //instance variable	
	int radius;
	float PI;
	String Shape_name;
	int length;
	int breadth;
	//instance Method
	void ShapeInfo() {
		System.out.println("Shape name:"+Shape_name+"\nRadius:"+radius+"\nPI:"+PI+"\nLength:"+length+"\nBreadth:"+breadth);
	}

}

//inheriting Circle2 using super class Shape
//sub class or derived class
 class Circle2 extends Shape {
	//instance variable
	float area;
	float perimeter;
	//instance method
	void details() {
		area=PI*radius*radius;
		perimeter=2*PI*radius;
		System.out.println("Area of Circle:"+area+"\nPerimeter of Circle:"+perimeter);
	}
  //main method
	public static void main(String[] args) {
		//creating object for sub class to access super class variables
		Circle2 circle=new Circle2();
		circle.Shape_name="Circle";
		circle.radius=2;
		circle.PI=3.14f;
		circle.ShapeInfo();
		circle.details();
		
		
	}

}

