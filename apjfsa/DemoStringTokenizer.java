package com.apjfsa;

import java.util.StringTokenizer;

public class DemoStringTokenizer {

	public static void main(String[] args) {
		StringTokenizer strt=new StringTokenizer("Hello Java World"," ",false);
		
		System.out.println(strt.countTokens());
		while(strt.hasMoreElements())
			System.out.println(strt.nextToken());
       String str=strt.toString();
     }

}
