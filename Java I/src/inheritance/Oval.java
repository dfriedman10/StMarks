package inheritance;
import java.awt.Graphics;

public class Oval extends Shape {

	private int w, h;
	
	public Oval(int x, int y, int w, int h) {
		super(x,y);
		this.w = w; this.h = h;
	}
	
	public void draw(Graphics g) {
		g.fillOval(getX(), getY(), w, h);
	}
}
