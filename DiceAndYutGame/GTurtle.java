package com.sd.DiceGame;
import ch.aplu.turtle.*;
import java.awt.Color;

public class GTurtle{
	Turtle t1 = new Turtle();
	public GTurtle(double x, double y){
		t1.penUp();
		t1.setPos(x,y);
		t1.penDown();
	}
	public void rColor(){
		t1.setPenColor("red");
	}
	public void bColor(){
		t1.setPenColor("blue");
	}
	public void move(int x){
		t1.fd(x*40);
	}
	public void backMove(){
		t1.back(40);
	}
	public double pos(){
		return t1.getY();
	}
}