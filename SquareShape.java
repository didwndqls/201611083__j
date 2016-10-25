package com.sd.Draw;

import ch.aplu.turtle.*;

public class SquareShape {
	public void drawSquare(int size) {
		Turtle t1 = new Turtle();
		for(int i=0;i<4;i++){
			t1.fd(size);
			t1.right(90);
		}
	}
	public static void main(String[] args){
		SquareShape s = new SquareShape();
		s.drawSquare(100);
	}
}