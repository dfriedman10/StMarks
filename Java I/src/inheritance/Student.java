package inheritance;

import java.util.Arrays;

import objects.Human;

public class Student extends Human {
	
	private int grade;
	private String[] classes;
	
	public Student(int a, int h, int g, String[] c) {
		super(a, h);
		this.grade = g;
		this.classes = c;
	}
	
	public void doHomework() {
		
		System.out.println("blah");
	}
	
	public String toString() {
		
		String output = super.toString();
		
		return output + ", " + grade + ", "  + Arrays.toString(classes);
	}
	
	public static void main(String[] args) {
		Student x = new Student(16, 70, 10, new String[] {"chem", "CS"});
		
		System.out.println(x.toString());
		
	}
	
}
