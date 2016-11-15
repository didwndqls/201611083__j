import ch.aplu.turtle.*;
public class P3_TurtleTracksMain{
	static void drawSquareFrom(double[][] tracks){
		Turtle t1 = new Turtle();
		t1.penUp();
		t1.moveTo(tracks[0][0],tracks[0][1]);
		t1.penDown();
		for(int i=1;i<tracks.length;i++) {
      t1.moveTo(tracks[i][0],tracks[i][1]);
		//Systme.out.printf("%.1f,%.1f",t[0],t[1]);
		}
	}
	public static void main(String[] args){
		double tracks[][]={{100,100},{200,100},{200,200},{100,200},{100,100}};
		drawSquareFrom(tracks);
	}
}
