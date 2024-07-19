//Write a program using Enum Department
package com.apjfsa;
//class declaration
public class DemoEnum {
	//declaring enumeration
	enum Department{
		Accounts,
		Develops,
		Testing,
		HR
		
	}
    //main method
	public static void main(String[] args) {
		// Creating an instance of Department enum and assigning it to 'd'
		Department d=Department.Testing;
		// Creating an instance of Department enum and assigning it to 'd1'
		Department d1=Department.Develops;
		// Creating an instance of Department enum and assigning it to 'd2'
		Department d2=Department.HR;
		//printing the value of d
		System.out.println(d);
		//comparing d with d1 it will return false
		System.out.println(d.equals(d1));
		//comparing d with d2
		System.out.println(d.compareTo(d2));
		System.out.println(d.Develops);
		
		

	}

}
