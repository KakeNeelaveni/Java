package com.other;

public class TrianglePattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern
        
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}