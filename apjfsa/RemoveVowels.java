package com.apjfsa;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
		String str2 = null;
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine().toLowerCase();
		
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			/*if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
				String str2=str.replaceAll("[aeiou]","");
			}*/
			 str2=str.replaceAll("[aeiou]","");
		}
		System.out.println(str2);

	}

}
