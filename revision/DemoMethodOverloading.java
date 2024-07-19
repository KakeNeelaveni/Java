package com.revision;

public class DemoMethodOverloading {
	void add(int a,int b) {
		System.out.println(a+b);
	}
	int add(int a,int b,int c) {
		return a+b;
	}

	public static void main(String[] args) {
		
		DemoMethodOverloading demo=new DemoMethodOverloading();
		demo.add(10, 20);

	}

}
