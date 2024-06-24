package com.apjfsa;
//imports
import java.util.Scanner;
import java.util.StringTokenizer;
//class declaration
public class CountNoVowels {
    //main method
	public static void main(String[] args) {
		//local variables
		int vcount=0;
		int ccount=0;
		System.out.println("Enter the String:");
		//scanner class to read string from console
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		//converting string into lower case
		str=str.toLowerCase();
		//to read word count
		StringTokenizer st=new StringTokenizer(str," ");
		//logic
		for(int i=0;i<str.length();i++) {
			//counts vowels
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vcount++;
			}
			//counts consonants
			else if(str.charAt(i)!=' ') {
				
				ccount++;
			}
			
		}
		//printing counts of vowel, consonants and word
		System.out.println("No.of vowels:"+vcount);
		System.out.println("No.of consonants:"+ccount);
		System.out.println("Word count:"+st.countTokens());
	}

}
