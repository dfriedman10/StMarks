package inheritance;
import java.awt.Graphics;

public class Triangle extends Shape {

	int x2,x3,y2,y3;
	
	public Triangle(int xone,int xtwo,int xthree,int yone,int ytwo,int ythree) {
		super(xone, yone);
		x2 = xtwo - xone;
		x3 = xthree - xone;
		y2 = ytwo - yone;
		y3 = ythree - yone;
	}

	@Override
	public void draw(Graphics g) {
		int[] xpts = {getX(),x2 + getX(),x3 + getX()};
		int[] ypts = {getY(),y2 + getY(),y3 + getY()};
		g.fillPolygon(xpts, ypts, 3);
	}
}
