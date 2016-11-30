package com.sd.ch8;

public class Ch8_Turtle{
	protected int nLimbs = 4;
	protected String food = null;
	public void setFood(String f){
		food = f;
	}
	public void eat(){
		System.out.printf("Turtle eat %s",food);
	}
}