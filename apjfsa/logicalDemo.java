package com.apjfsa;

public class logicalDemo {

	public static void main(String[] args) {
		//Logical operators
		boolean a=true;
		boolean b=false;
		int c,d;
		c=20;
		d=40;
		System.out.println("a&&b="+(a&&b));
		System.out.println("a||b="+(a||b));
		System.out.println("!a="+(!a));
		//Bitwise operators
		
		int x=0b1011;
		int y=0b1110;
		System.out.println("x&y="+(x&y));
		System.out.println("x|y="+(x|y));
		System.out.println("x^y="+(x^y));
		System.out.println("~x="+(~x));
		System.out.println("x<<1="+(x<<1));
		System.out.println("y>>2="+(y>>2));
		
		//ternary operator
		int big=c>d?c:d;
		//int big=c<d?c:d;
		System.out.println("Big="+big);
		
		
	}

}
