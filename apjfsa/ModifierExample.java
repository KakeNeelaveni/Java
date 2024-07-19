/*Write a program using different access specifiers for declaring the variables.
public, private, protected and default.*/
package com.apjfsa;

 class ModifierDemo {
	//instance variables 
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

public class ModifierExample{
	//main method
	public static void main(String[] args) {
		//creating object for ModifierDemo to access its variables
		ModifierDemo mdemo=new ModifierDemo();
		//using object we assign values for variables
		mdemo.num1=12;
		//access level of private is only within the class.
		//we can not access from out side of class.
		//so we created setters and getters to access num2

		mdemo.setNum2(8);
		
		mdemo.num3=10;
		mdemo.num4=4;
		
		 // Accessing public member
		System.out.println("num1="+mdemo.num1);
		
        // Accessing private member (through public method)

		System.out.println("num2="+ mdemo.getNum2());
		// Accessing protected member
		System.out.println("num3="+mdemo.num3);
		  // Accessing default member
		System.out.println("num4="+mdemo.num4);
	}
	
}


