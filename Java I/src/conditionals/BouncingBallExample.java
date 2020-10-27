package conditionals;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BouncingBallExample extends JPanel {
	
	// constants that are predefined and won't change
	private static final int WIDTH = 600, HEIGHT = 600, WINDOW_HEIGHT = 650;
	private static final int DIAM = 30;

	// keeps track of the velocity of our ball
	private double ball_vx = 2, ball_vy = 3;

	// records the position of the ball
	private int ballx = WIDTH/2, bally = HEIGHT/2;
	
	private Color color = Color.CYAN;
	private int stringX = -1, stringY = -1;
	
	
	// move the ball according to its current velocity
	public void move_ball() {
		
		ballx += ball_vx;
		bally += ball_vy;
		
	}
	
	// check if the ball should bounce
	public void check_collisions() {
		
		if (ballx + DIAM >= WIDTH || ballx <= 0) {
			ball_vx *= -(Math.random()*.3+.9);
			stringX = (int)(Math.random()*(WIDTH-50));
			stringY = (int)(Math.random()*(HEIGHT-20));
			color = new Color((int)(Math.random()*255), (int)(Math.random()*255),(int)(Math.random()*255));
		}
		if (bally + DIAM >= HEIGHT || bally <= 0) {
			ball_vy *= -(Math.random()*.3+.9);
			stringX = (int)(Math.random()*(WIDTH-50));
			stringY = (int)(Math.random()*(HEIGHT-20));
			color = new Color((int)(Math.random()*255), (int)(Math.random()*255),(int)(Math.random()*255));
		}
	}
	
	// runs the actual game once graphics are set up
	public void run() {

		// while(true) should rarely be used to avoid infinite loops, but here it is ok because
		// closing the graphics window will end the program
		while (true) {
	
			// updates the scene
			move_ball();
			check_collisions();
			
			// draws the game
			repaint();
			
			//rests for a hundredth of a second
			try {
				Thread.sleep(10);
			} catch (Exception ex) {}

		}
	}
	
	
	/////////////////////////////////////////
	/////////////////////////////////////////
	
	// YOU DO NOT HAVE TO READ ANY FURTHER - THE REST IS GRAPHICS WHICH 
	// YOU ARE NOT RESPONSIBLE FOR
	
	// very simple main method to get the game going
	public static void main(String[] args) {
		new BouncingBallExample(); 
	}
 
	// does complicated stuff to initialize the graphics and key listeners
	public BouncingBallExample() {
		JFrame frame = new JFrame();
		frame.setSize(WIDTH, WINDOW_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		run();
	}

	// defines what we want to happen anytime we draw the game
	public void paint(Graphics g) {
		
		// background color is gray
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		// draws the ball blue
		g.setColor(color);
		g.fillOval(ballx, bally, DIAM, DIAM);
		
		if (stringX != -1) {
			g.setColor(Color.BLACK);
			g.drawString("BOUNCE", stringX, stringY);
		}
	}
}