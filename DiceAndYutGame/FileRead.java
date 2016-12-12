package com.sd.DiceGame;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

public class FileRead {
	public void print() {
		try {
			File f=new File("game.txt");
			FileReader fr = new FileReader(f); 
			BufferedReader br = new BufferedReader(fr); 
			String s; 
			while((s = br.readLine()) != null) { 
	    		System.out.println(s); 
			} 
			fr.close();
		}
		catch (IOException e) {
			System.out.println("IOException Error.");
		} 
	}
	public int inputSat(int x) {
		return x;
	}
	public String inputSat(String x) {
		return x;
	}
	public void fWrite() {
		Scanner sc1 = new Scanner(System.in);
		int sl = 0;
		try {
			System.out.print("Please enter the satisfaction of the game as a integer number. ");
			sl = sc1.nextInt();
		}
		catch (Exception e) {
			System.out.println("input number!");
		}
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Please enter a comment: ");
		String c = sc2.nextLine();
		System.out.println("Close the game and click the 'review' text file.");
		try {
			FileWriter wf = new FileWriter("review.txt");
			BufferedWriter bf = new BufferedWriter(wf);
			bf.write("satisfaction level: "+inputSat(sl)+"\n");
			bf.write("comment: "+inputSat(c)+"\n");
			bf.close();
		}
		catch (IOException e) {
			System.out.println("IOException Error.");
		} 
	}
}