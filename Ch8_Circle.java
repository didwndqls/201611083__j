package com.sd.ch8;

public class Ch8_Circle extends Ch8_Point{
	private double radius = 0.0;
	private double area = 0.0;
	public Ch8_Circle(int x, int y, double r){
		super(x,y);
		radius=r;
	}
	public double getArea(){
		area = radius*radius*Math.PI;
		return area;
	}
	public void printArea(){
		System.out.printf("Area is %.2f",area);
	}
	public static void main(String[] args){
		Ch8_Circle c = new Ch8_Circle(50,50,10.0);
		c.getArea();
		c.printArea();
	}
}