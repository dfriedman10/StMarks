package inheritance;
import java.awt.Color;

public class BouncingBall extends Ball {
	
	public BouncingBall(int startx, int starty, int startrad, 
			int startxspeed, int startyspeed, Color startcolor) {
		
		super(startx, starty, startrad, startxspeed, startyspeed, startcolor);
	}
	
	
	public void move() {
		
		super.move();
		
		if (getX() + getRad()*2 >= WIDTH || getX() <= 0) {
			
			setXSpeed(-getXSpeed());
		}
		if (getY() + getRad()*2 >= HEIGHT || getY() <= 0) {
			
			setYSpeed(-getYSpeed());
		}		
	}
	
}
