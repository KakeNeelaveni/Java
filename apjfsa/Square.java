package com.apjfsa;
//class declaration
public class Square {
	//instance variable
	int side;
	//instance method
	void area() {
		System.out.println("arae of square is"+(side*side));
	}
	//instance method
	void perimeter() {
		System.out.println("perimeter of square is"+(4*side));
	}
	

	public static void main(String[] args) {
		//object creation for Square
		Square s=new Square();
		s.side=5;
		s.area();
		s.perimeter();
	

	}

}
