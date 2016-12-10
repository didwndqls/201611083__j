package com.sd.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

// public class PrintFile {
// 	void print() throws IOException {
// 		File f = new File("noname.txt");
// 		FileReader fr = new FileReader(f);
// 		fr.close();
// 	}
// }

public class PrintFile {
	public static void main(String[] args) {
		try {
			File f = new File("noname.txt");
			FileReader fr = new FileReader(f);
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}