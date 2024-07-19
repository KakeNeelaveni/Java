package com.exe;

import java.io.File;
import java.io.IOException;

public class FirstFileHandlingApp {

	public static void main(String[] args) {
		File file = new File("Demo.txt");
		try {
			if (file.createNewFile())
				System.out.println("Demo.txt file created");
			else
				System.out.println("There is some problem in creating Demo.txt file");

		} catch (IOException e) {
			System.out.println("IOEcxeption Thrown");
		}

	}

}
