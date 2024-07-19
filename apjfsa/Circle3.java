package com.apjfsa;

public class Circle3 implements Shapes {
	int radius;

	public Circle3(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public int area() {
		int area=(int) (pi*radius*radius);
		return area;
	}

	@Override
	public int perimeter() {
		int perimeter=(int) (2*pi*radius);
		return perimeter;
	}

}
