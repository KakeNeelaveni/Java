package com.apjfsa;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
;        int sum = getSingleDigitSum(number);
        System.out.println("Single-digit sum: " + sum);
    }

    
    public static int getSingleDigitSum(int num) {
        while (num > 9) {
            int sum = 0;
            // Calculate sum of digits
            while (num != 0) {
                sum += num % 10; 
                num /= 10; 
            }
            num = sum; 
        }
        return num; 
    }
}

