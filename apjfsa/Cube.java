package com.apjfsa;

public class Cube  extends Square2 implements ThreeDShape, Shapes {

	

	

	public Cube(int side) {
		super(side);
		//this.side=side;
	}

	@Override
	public int area() {
		int area=6*side*side;
		return area;
	}

	@Override
	public int perimeter() {
		int perimeter=12*side;
		return perimeter;
	}

	@Override
	public double volume() {
		double volume=side*side*side;
		return volume;
	}
	
public static void main(String[] args) {
		Cube c=new Cube(20);
		System.out.println("Area of cube:"+c.area());
		System.out.println("perimeter of cube:"+c.perimeter());
		System.out.println("volume of cube:"+c.volume());

	}

}
