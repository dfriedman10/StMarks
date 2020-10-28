package loops;
import java.util.Scanner;

public class IntroLoopsCW {

	private Scanner in = new Scanner(System.in);	
	
	// get two numbers from the user and print all 
	// integers between, inclusive
	public void numsBetween() {
		
		// get two inputs
		System.out.println("Enter a number");
		int num1 = in.nextInt();
		System.out.println("Enter a bigger number");
		int num2 = in.nextInt();
		
		// print out the numbers from num1 to num2
		while (num1 <= num2) {
			System.out.print(num1+", ");
			num1 ++;
		}
	}
	
	// prints the first 6 terms of an exponential sequence
	public void expSequence() {
		
		// get two inputs
		System.out.println("\n\nEnter a base");
		int b = in.nextInt();
		System.out.println("Enter a coefficient");
		int a = in.nextInt();
		
		// we need a counter to count the number of terms we 
		// have printed
		int count = 0;
		
		// we can't change b, otherwise we will forget our base
		// so we need to create another variable to record our 
		// multiplication
		int exp = 1; 
		
		// run the loop 6 times
		while (count < 6) {
			
			// print our multiplication so far, multiplied by the 
			// coefficient
			System.out.print(a*exp+ ", ");
			
			exp *= b;
			count ++;
		}
	}
	
	// finds the square root of a number
	public void squareRoot() {
		
		// get input
		System.out.println("\n\nEnter a number");
		int num = in.nextInt();
		
		// this counter will count from 1 to n, checking if 
		// the current number is the square root during each step
		int count = 0;
		while (count <= num) {
			
			// check if the current count is a square root of num. if it is,
			// we can stop searching.
			if (count*count == num) {
				System.out.println("The square root of " + num +" is " +count);
				break;
			}
			
			// if it's not, go on to the next count
			count++;
		}
		
		// if we reached a count higher than the input, 
		// we did not find a square root, so we should say so
		if (count > num)
			System.out.println(num+" has no square root");
	}
	
	public static void main(String[] args) {
		IntroLoopsCW tester = new IntroLoopsCW();
		tester.numsBetween();
	}

}
