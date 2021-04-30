package objects;

public class Classroom {

	private Human[] students;
	private String type;
	
	public Classroom(Human[] s) {
		students = s;
	}
	
	public Classroom(int size) {
		students = new Human[size];
	}
	
	public void addStudent(Human newStudent, int i) {
		students[i] = newStudent;
	}
	
	public double avgAge() {
		double avg = 0;
		int count = 0;
		for (Human h : students) {
			
			if (h != null) {
				avg += h.getAge();
				
				count ++;
			}
		}
		
		return avg/count;
		
	}
	
	public static void main(String[] args) {
		
		Classroom c = new Classroom(5);
		c.addStudent(new Human(15, 60), 0);

		c.addStudent(new Human(14, 60), 1);

		c.addStudent(new Human(16, 70), 2);
		
		System.out.println(c.avgAge());
		
	}
}
