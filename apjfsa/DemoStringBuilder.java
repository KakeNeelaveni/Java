//Write a program String Builder
package com.apjfsa;
//class declaration
public class DemoStringBuilder {
    //main method
	public static void main(String[] args) {
		// Initialize StringBuilder with a string
		 StringBuilder strbul=new StringBuilder("Hello world");
		 //Printing the StringBuilder object
		 System.out.println(strbul);
		 System.out.println(strbul.length());
		 System.out.println(strbul.lastIndexOf("o"));
		 
		// String s=strbul.toString();
		 StringBuffer str=new StringBuffer(strbul);
		 System.out.println(str);
		// Initialize a new StringBuffer with a string
		 StringBuffer str1=new StringBuffer("java");
		// Convert StringBuffer to StringBuilder
		 StringBuilder strbu2=new StringBuilder(str1);
		 System.out.println(strbu2);
	}

}
