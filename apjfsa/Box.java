package com.apjfsa;
//class declaration
public class Box {
	
	//instance variable
	int length,breadth;
	
	//static variable
	static int a;
	
	//instance method
	void measurements() {
		//local variable
		int area=length*breadth;
		System.out.println("measurements of a box "+length+","+breadth);
		System.out.println("Area="+area);
	}
	//static method
	static void msg() {
		System.out.println("static method"+a);
	}
	//static block
	static {
		System.out.println("static block");
	}

	public static void main(String[] args) {
		//object creation for box
		Box b=new Box();
		b.length=20;
		b.breadth=10;
		b.measurements();
		//b.a=12;
		a=100;
		msg();
		
		Box b1=new Box();
		b1.length=200;
		b1.breadth=50;
		b1.measurements();
		
		//same memory reference for b1 and b2
		
		Box b2=b1;
		b2.measurements();
		
	}

}
