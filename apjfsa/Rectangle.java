package com.apjfsa;

public class Rectangle extends Shape2{
	
	int length;
	int breadth;
	
	public Rectangle(String name,int length,int breadth) {
		super(name);
		this.length=length;
		this.breadth=breadth;
	}
	
	@Override
	void area() {
		int a=length*breadth;
		System.out.println("Area="+a);
		
	}

	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle("Rectangle",12,5);	
		rectangle.shapeInfo();
		rectangle.area();
		
	}

	

}
