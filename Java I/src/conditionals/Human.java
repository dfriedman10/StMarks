package conditionals;

public class Human {

	// instance variables to save our information, so that 
	// we don't need to ask for input repeatedly.
	private int age;
	private char gender;
	
	// saves the age as an instance variable
	public void set_age(int age_input) {
		age = age_input;
	}
	
	// saves the gender as an instance variable
	public void set_gender(char gender_input) {
		gender = gender_input;
	}
	
	// note that we don't need any parameters because 
	// we already saved the age
	public void can_vote() {
		
		if (age >= 18) {
			System.out.println("I can vote");
		}
		else {
			System.out.println("I can't vote :(");
		}
	}
	
	public void needs_tetanus() {
		
		if (age % 4 == 0) {	// use modulus to check if age is a multiple of 4
			System.out.println("I need a tetanus shot");
		}
		else {
			System.out.println("I don't need a tetanus shot");
		}
	}
	
	public void is_toddler() {
		// checks both if the gender is 'boy' and the 
		// age is less than 4
		if (gender == 'b' && age < 4) {
			System.out.println("I am a boy toddler");
		}
		else if (gender == 'g' && age < 4) {
			System.out.println("I am a girl toddler");
		}
		else {
			System.out.println("I am not a toddler");
		}
	}
	
	public void get_discount() {
		
		// checks if the human is either less than 12 or more 
		// than 65
		if (age >= 65 || age <= 12) {
			System.out.println("I get a discount!");
		}
		else {
			System.out.println("I don't get a discount");
		}
	}
	
	public void is_teenager() {
		
		// checks if the human is between 12 and 18
		if (age >= 12 && age <= 18) {
			System.out.println("I am a teenager");
		}
		else {
			System.out.println("I'm not a teenager");
		}
	}
	
	public static void main(String[] args) {
		Human bob = new Human();
		System.out.println("Bob:");
		bob.set_age(70);
		bob.set_gender('b');
		bob.can_vote();
		bob.needs_tetanus();
		bob.is_toddler();
		bob.is_teenager();
		bob.get_discount();
		
		Human jane = new Human();
		System.out.println("\nJane:");
		jane.set_age(16);
		jane.set_gender('g');
		jane.can_vote();
		jane.needs_tetanus();
		jane.is_toddler();
		jane.is_teenager();
		jane.get_discount();
		
		Human baby = new Human();
		System.out.println("\nBaby:");
		baby.set_age(1);
		baby.set_gender('g');
		baby.can_vote();
		baby.needs_tetanus();
		baby.is_teenager();
		baby.is_toddler();
		baby.get_discount();
	}
	
	// answers to the challenge - don't bother reading this
	// if you are new to Java!
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public void canBeTeammates(Human h) {
		if (Math.abs(h.getAge()-age) <= 2 && 
				h.getGender() == gender)
			System.out.println("yes");
		else 
			System.out.println("no");
	}
}
