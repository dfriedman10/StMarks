package inheritance;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class ShapeRunner {
	
	private Shape[] shapes;
	
	// this method should move all the shapes in the list
	public void moveShapes() {
		
		for (Shape s : shapes) 
			s.move(3, 3);
	}
	
	// fill in your shape list here
	public void setup() {
		
		shapes = new Shape[4];
		shapes[0] = new Shape(100,100);
		shapes[1] = new Oval(200,200,100,50);
		shapes[2] = new Triangle(300,300,400,300,400,300);
		shapes[3] = new Rect(400,100,50,100);
	}
	
	// DON'T TOUCH BELOW CODE
	
	public void run() {
		while (true ) {
			moveShapes();
			frame.repaint();
			try {
				Thread.sleep(75);
			} catch (Exception ex) {}
		}
	}
	
	public static void main(String[] args) {
		new ShapeRunner(); 
	}
	private JFrame frame;
	public ShapeRunner() {
		setup();
		frame = new JFrame() {
			public void paint(Graphics g) {
				g.setColor(Color.WHITE);
				g.fillRect(0, 0, 1000, 800);
				
				for (Shape s: shapes)
					s.draw(g);
			}
		};
		frame.setSize(1000, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		run();
	}
}