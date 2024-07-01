package com.exe;

public class DemoClassCastExe {

	public static void main(String[] args) {
		
		int a=105;
		char ch=(char) a;
		
		Object obj=new Object();
		try {
		String s=(String) obj;
		
		System.out.println(s);
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
