package com.sd.DiceGame;

public class Dice{
	protected int number = 0;
	public void roll(){
		number = (int) (Math.random()*6)+1;
	}
	public int getNum(){
		return number;
	}
}
