package com.apjfsa;

public class DemoModifier2 {

	public static void main(String[] args) {
		DemoModifier demo=new DemoModifier();
		demo.num1=12;
		demo.num3=14;
		demo.num4=15;
		
		System.out.println("num1"+demo.num1);
		
		
		
		demo.setNum2(18);
		
	    System.out.println("num2"+demo.getNum2());
		
		
		

	}

}
