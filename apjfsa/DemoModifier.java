package com.apjfsa;

public class DemoModifier {
	
	public int num1;
	private int num2;
	protected int num3;
	int num4;
	
	public int getNum2() {
		return num2;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	

}

class DemoModifier1 {

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

