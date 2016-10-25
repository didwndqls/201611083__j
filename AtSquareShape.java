package com.sd.Draw;
import ch.aplu.turtle.*;
import java.awt.geom.Point2D;

public class AtSquareShape {
	public void drawSquareAt(double x,double y,int size){
		Turtle t1 = new Turtle();
		t1.penUp();
		t1.setPos(x,y);
		t1.penDown();
		for(int i=0;i<4;i++){
			t1.fd(size);
			t1.right(90);
		}
	}
	public static void main(String[] args){
		AtSquareShape s = new AtSquareShape();
		Point2D p1 = new Point2D.Double(100.0,100.0);
		s.drawSquareAt(p1.getX(),p1.getY(),50);
	}
}