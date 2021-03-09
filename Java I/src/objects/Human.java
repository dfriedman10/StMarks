package objects;

// human example class from 3/5

public class Human {

	private int age;
	private int height;
	
	public Human(int a, int h) {
		age = a;
		height = h;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}    
	
	public static void main(String[] args) {
    	
		Human david = new Human(40, 100);
		Human james = new Human(20, 80);
		
    	System.out.println(james.getAge());
    	
    	james.setAge(30);
    	
    	System.out.println(david.getAge());

    }
}
