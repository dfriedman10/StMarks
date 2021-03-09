package objects;
import java.awt.Color;

// Shape example from class 3/9
public class Shape {
	
	private String type;
	private int width, height;
	private Color color;
	
	public Shape(String type, int width, 
			int height, Color color) {
		
		this.type = type;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public Shape(int width, int height) {
		this.type = "circle";
		this.width = width;
		this.height = height;
		this.color = Color.blue;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setColor(Color newColor) {
		color = newColor;
	}

	public void increaseSize() {
		height++; width++;
	}
	
	public String toString() {
		return type + ", " + width + ", " 
				+ height+ ", " + color;
	}
	
	public static void main(String[] args) {
		
		Shape x = new Shape("circle", 40, 50, Color.black);
		Shape y = new Shape(40, 50);
		
		System.out.println(y);
		
		
	}
}
