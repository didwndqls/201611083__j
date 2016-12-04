package com.sd.ch8_2;

public class Hello{
	private String name;
	public Hello(String name){
		this.name = name;
	}
	public void sayHello(){
		System.out.println("Hello "+name);
	}
	public static void main(String[] args) {
		Hello[] h = new Hello[5];
		h[0] = new Hello("jb1");
		h[1] = new Hello("jb2");
		h[2] = new Hello("jb3");
		h[3] = new Hello("jb4");
		h[4] = new Hello("jb5");
		for(Hello a:h){
			a.sayHello();
		}
	}
}