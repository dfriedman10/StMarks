package inheritance;
import java.awt.Graphics;

public class Rect extends Shape {

	private int w, h;
	
	public Rect(int x, int y, int w, int h) {
		super(x, y);
		this.w = w; this.h = h;
	}
	
	public void draw(Graphics g) {
		g.fillRect(getX(), getY(), w, h);
	}

}
