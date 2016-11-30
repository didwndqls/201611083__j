package com.sd.ch8;

//import com.sd.ch9.Turtle;

public class Ch8_LandTurtle extends Ch8_Turtle{
	public void walk() {
		System.out.println("A land turtle walks...");
	}
	public static void main(String[] args){
		Ch8_LandTurtle lt = new Ch8_LandTurtle();
		lt.setFood("Zucchini");
		lt.eat();
		lt.walk();
		System.out.println("Land turtle has "+lt.nLimbs+" limbs");
	}
}