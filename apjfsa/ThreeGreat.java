package com.apjfsa;

import java.util.Scanner;

public class ThreeGreat {
	
	static void greatest(int a,int b,int c) {
		if(a>b) {
			if(a>c) 
				System.out.println(a+"is greater");
			
			else 
				System.out.println(c+"is greater");	
			
		}
		else if(b>c)
			
				System.out.println(b+"is greater");
		
		else 
			System.out.println(c+"is greater");
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter three numbers:");
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		greatest(x,y,z);

	}

}
