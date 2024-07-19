package com.exe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DemoFileWriter {

	public static void main(String[] args) throws IOException {

		FileWriter fwrite;
		try {
			fwrite = new FileWriter("Demo.txt");

			fwrite.write("Hello java world. Welcome to Object oriented programming.");
			fwrite.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		File file = new File("Demo.txt");

		Scanner scanner = null;
		try {
			scanner = new Scanner(file);

			if (scanner.hasNext()) {
				String str = scanner.nextLine();
				System.out.println(str);
				scanner.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} finally {
			scanner.close();
		}

		System.out.println("Length of the File:" + file.length());

	}

}
