package com.revision;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadIntegersFromFile {
    public static void main(String[] args) {
        String fileName = "integers.txt"; // Replace with your file name

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            System.out.println("Reading integers from file: " + fileName);

            while (scanner.hasNext()) {
                String value = scanner.next();
                try {
                    int number = Integer.parseInt(value);
                    System.out.println("Read integer: " + number);
                } catch (NumberFormatException e) {
                    System.err.println("Non-integer value found and skipped: " + value);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: The file '" + fileName + "' was not found.");
        }
    }
}
