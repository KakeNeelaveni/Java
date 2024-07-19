package com.apjfsa;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (0 <= n <= 30): ");
        int n = scanner.nextInt();
        
        // Check if the input is within the valid range
        if (n < 0 || n > 30) {
            System.out.println("Input should be between 0 and 30.");
            return;
        }

        System.out.println("The " + n + "-th Fibonacci number is: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        
        int fib0 = 0;
        int fib1 = 1;
        int fibN = 0;
        
        for (int i = 2; i <= n; i++) {
            fibN = fib0 + fib1;
            fib0 = fib1;
            fib1 = fibN;
        }
        
        return fibN;
    }
}