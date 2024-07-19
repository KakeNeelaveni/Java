package com.apjfsa;

import java.util.Scanner;

public class DuplicateString {

	public static void main(String[] args) {
		int count = 0;
		System.out.println("Enetr the String");
		Scanner sc=new Scanner(System.in);
		String word=sc.next();
		char ch[]=word.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[j]);
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
