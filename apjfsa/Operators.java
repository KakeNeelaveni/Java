//program using arithmetic and relational operators

package com.apjfsa;
//class declaration
public class Operators {
    //main method
	public static void main(String[] args) 
	{
		//instance variable
		int a,b;
		a=10;
		b=20;
		//arithmetic operations	
		System.out.println("arithmetic operations are:");
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
		//relational operators
		System.out.println("\nRelational operators are:");
		System.out.println("a<b is"+(a<b));
		System.out.println("a<=b is"+(a<=b));
		System.out.println("a>b is"+(a>b));
		System.out.println("a>=b is"+(a>=b));
		System.out.println("a==b is"+(a==b));
		System.out.println("a!=b is"+(a!=b));
		
	 }

}
