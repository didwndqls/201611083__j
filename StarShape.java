package com.sd.Draw;
import ch.aplu.turtle.*;


public class StarShape{
	public void drawStar(int size){
		Turtle t1 = new Turtle();
		t1.setHeading(90);
		for(int i=0;i<5;i++){
			t1.fd(size);
			t1.right(144);
		}
	}
	public static void main(String[] args){
		StarShape s = new StarShape();
		s.drawStar(100);
	}
}