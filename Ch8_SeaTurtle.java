package com.sd.ch8;

//import com.sd.ch9.Turtle;

public class Ch8_SeaTurtle extends Ch8_Turtle{
	public void swim() {
		System.out.print("A sea turtle swims...");
	}
	public static void main(String[] args){
		Ch8_SeaTurtle st = new Ch8_SeaTurtle();
		st.setFood("Crab");
		st.eat();
		st.swim();
		System.out.println("Sea turtle has "+st.nLimbs+" limbs");
	}
}















// public class SeaTurtle extends com.sd.ch9.Turtle{

// }