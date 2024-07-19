package com.revision;

public class Terinary {

	public static void main(String[] ar) {
		System.out.println("Simple");
		int a=100, b=10, c=30, result;
		
		result=((a>b)?(a>c)?a:c:(b>c)?b:c);
		System.out.println("Max of three numbers:"+result);
		char ch=(char) a;
		//ch+='v';
		System.out.println(ch);
		int d=10;
		long g=d;
		float h=d;
		System.out.println(h);

	}

}
