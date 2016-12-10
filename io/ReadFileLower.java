package com.sd.io;

import java.io.*;

public class ReadFileLower{
	public static void file2Lower(String s){
		String a = s.toLowerCase();
		System.out.println(a);
	}
	public static void main(String[] args) throws Exception{
		try{
			FileReader fr = new FileReader("text.txt");
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s = br.readLine()) != null) {
				file2Lower(s);
			}
			fr.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}
}