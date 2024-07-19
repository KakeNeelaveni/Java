//Write a program String Buffer
package com.apjfsa;
//class declaration
public class DemoStringBuffer {
	//main method
	public static void main(String args[]) {
		// Initialize a new StringBuffer with a string
		StringBuffer strbuff=new StringBuffer("Anudip");
		//Printing the StringBuffer object
		System.out.println(strbuff);
		//some methods on string buffer
		strbuff.append("Foundation");
		System.out.println(strbuff);
		System.out.println(strbuff.reverse());
		System.out.println(strbuff.charAt(3));
		System.out.println(strbuff.indexOf("c"));
		System.out.println(strbuff.capacity());
		// Initialize another StringBuffer with a string
		StringBuffer strb=new StringBuffer("Anudip javafull stack");
		System.out.println(strb.capacity());//default=16
		strb.deleteCharAt(6);
		System.out.println(strb);
		System.out.println(strb.codePointAt(0));
		System.out.println(strbuff.compareTo(strb));
		System.out.println(strbuff.hashCode());
		System.out.println(strb.substring(0, 6));
		System.out.println(strb.append(" using Angular"));
		
		
	}

}
