import ch.aplu.turtle.*;
import java.util.ArrayList;

public class P2_TurtleTracksMain{
  Turtle t1 = new Turtle();
  Double[] pos = new Double[2];
  ArrayList<Double[]> posArr = new ArrayList<Double[]>(); 
  public void drawSquareAtSave(int size){
    for(int i=0;i<4;i++){
      pos[0]=t1.getX();
      pos[1]=t1.getY();
      posArr.add(pos);
      System.out.printf("(%.1f,%.1f)\n",pos[0],pos[1]);
      t1.fd(size);
      t1.right(90);
    }
  }
  public static void main(String[] args){
    P2_TurtleTracksMain p2 = new P2_TurtleTracksMain();
    p2.drawSquareAtSave(150); 
  }
}