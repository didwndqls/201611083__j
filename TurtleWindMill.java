import ch.aplu.turtle.*;

public class TurtleWindMill {
	public void drawWindMill(int size,int sides,int bigger,double degree) {
		Turtle t1 = new Turtle();
		for (int i=0;i<sides;i++) {
			t1.fd(size);
			t1.right(degree);
			if(i%2!=0) {
				size+=bigger;
			}
		}
	}
	public static void main(String[] args) {
		TurtleWindMill t = new TurtleWindMill();
		int size = 5;
		int sides = 30;
		int bigger = 10;
		double degree = 90.0;
		t.drawWindMill(size,sides,bigger,degree);
	}
}
