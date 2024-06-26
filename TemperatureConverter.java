package com.other;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("Enter a temperature in celsius");
			Scanner sc=new Scanner(System.in);
			int C=sc.nextInt();
			float f=(9/5)*C+32;
			System.out.println(f+"F");
			if(f<32)
				System.out.println("Very cold");
			else if(f>=32 && f<50)
				System.out.println("Cold");
			
		}
		

	}

}
