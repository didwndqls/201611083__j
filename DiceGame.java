package com.sd.DiceGame;

public class DiceGame {
  private Player p1;
  private Player p2;
  private int setOne=0;
  private int setTwo=0;
  private int result = 0;
  
  public void setMul(int setOne, int setTwo) {
    result = setOne*setTwo;
    }
  public int getMul() {
    return result;
    }
  
  public void startGame() {
    DiceGame g1 = new DiceGame();
    DiceGame g2 = new DiceGame();
    p1=new Player("A");
    p2=new Player("B");
    
    p1.play();
    System.out.println(p1.getName()+" first score: "+p1.getNum());
    setOne=p1.getNum();
    p1.play();
    System.out.println(p1.getName()+" second score: "+p1.getNum());
    setTwo=p1.getNum();
    g1.setMul(setOne,setTwo);
    
    
    p2.play();
    System.out.println(p2.getName()+" first score: "+p2.getNum());
    setOne=p2.getNum();
    p2.play();
    System.out.println(p2.getName()+" second score: "+p2.getNum());
    setTwo=p2.getNum();
    g2.setMul(setOne,setTwo);
    
    
    if(g1.getMul() > g2.getMul()) {
      System.out.println(p1.getName()+" Multiplication score is "+g1.getMul()+" and won!");
    } 
    else if (g1.getMul() < g2.getMul()) {
      System.out.println(p2.getName()+" Multiplication score is "+g2.getMul()+" and won!");
    }
    else {
      System.out.println("Draw");
    }
  }
  public static void main(String[] args) {
    DiceGame g = new DiceGame();
    g.startGame();
  }
}