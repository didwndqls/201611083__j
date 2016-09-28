public class Rectangle {
private int width;
private int height;
public Rectangle(int width, int height) {
this.width = width;
this.height = height;
}
public int getWidth() {
return width;
}
public int getHeight() {
return height;
}
public void setWidth(int newWidth) {
width=newWidth;
}
public void setHeight(int newHeight) {
height=newHeight;
}
public void setSize(int w, int h) {
setWidth(w);
setHeight(h);
}
public int calcArea() {
return width*height;
}
}

Rectangle r = new Rectangle(4,8);
r.calcArea();

r.setSize(5,8);
r.calcArea();