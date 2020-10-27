package conditionals;
import java.util.Scanner;

public class ScannerPractice {

	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		double num1 = input.nextDouble();
		
		System.out.println("Press a key. s to find square root, e to determine "
				+ "\neven/odd, d to determine if a second number is a factor, and "
				+ "\nw to determine if a second number is within 3.");
		String key = input.next();
		
		if (key.equals("s"))
			System.out.println("sqare root: "+Math.sqrt(num1));
		else if (key.equals("e")) {
			if (num1%2 == 0)
				System.out.println("The number is even");
			else if (num1%2 == 1) 
				System.out.println("The number is odd");
			else 
				System.out.println("the number is not a whole number");
		}
		else if (key.equals("d")) {
			System.out.println("Enter a second number.");
			double num2 = input.nextDouble();
			if (num1%num2 == 0) 
				System.out.println("This is a factor");
			else 
				System.out.println("Not a factor");
		}
		else if (key.equals("w")) {
			System.out.println("Enter a second number.");
			double num2 = input.nextDouble();
			if (Math.abs(num1-num2) <= 3) 
				System.out.println("The two numbers are within 3 of each other");
			else 
				System.out.println("Not within 3");
		}
		else
			System.out.println("not a valid key. try again.");
		
		run();
	}
	
	public static void main(String[] args) {
		ScannerPractice tester = new ScannerPractice();
		tester.run();
	}

}
