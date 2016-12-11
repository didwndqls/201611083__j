package com.sd.DiceGame;

public class YutNoriGame extends Player{
	protected String result = null;
	public YutNoriGame(String n){
		super(n);
	}
	public void designate(int number) {
		if (number == 1){
			result = "Do";
		}
		else if (number == 2){
			result = "Gae";
		}
		else if (number == 3){
			result = "Gul";
		}
		else if (number == 4){
			result = "Yut";
		}
		else if (number == 5){
			result = "Mo";
		}
		else {
			result = "BackDo";
		}
	}
	public void startGame() {
		play();
		designate(getNum());
		System.out.println(getName()+" get: "+result);
		if (getNum()<6) {
			System.out.println(getName()+"'s Turtle move forward "+getNum()+" spaces.");
		}
		else {
			System.out.println(getName()+"'s Turtle move back 1 spaces.");
		}
	}
}