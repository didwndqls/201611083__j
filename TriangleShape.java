package com.sd.Draw;
import ch.aplu.turtle.*;

public class TriangleShape{
	public void drawTriangle(int size){
		Turtle t1 = new Turtle();
		t1.setHeading(90);
		for(int i=0;i<3;i++){
			t1.fd(size);
			t1.left(120);
		}
	}
	public static void main(String[] args){
		TriangleShape t = new TriangleShape();
		t.drawTriangle(100);
	}
}