package loops;
import java.util.Scanner;

public class MoreWithLoopsCW {
	
	private Scanner in = new Scanner(System.in);
	
	// Easy #1
	public void guessNumber() {
		// get a number
		System.out.println("Enter a number");
		int num = in.nextInt();
		
		while (num != 18) {
			// get another number until it's 18
			System.out.println("Enter a number");
			num = in.nextInt();
		}
		System.out.println("Good job");
	}
	
	// Easy #2
	public void negBetween() {
		// get the number to count between
		System.out.println("Enter a number");
		int num = in.nextInt();
		
		// we need a counter since we can't overwrite
		// the input
		int count = -num;
		
		// count from -n up to n
		while (count <= num) {
			System.out.println(count);
			count ++;
		}
	}
	
	// Easy #3
	public void hi() {
		// get the number of times to say hi
		System.out.println("Enter a number");
		int num = in.nextInt();
		
		// use this number as a counter - counting down
		while (num > 0) {
			System.out.println("hi");
			num --;
		}
	}
	
	// Medium #1
	public void factorial() {
		// get a number
		System.out.println("Enter a number");
		int num = in.nextInt();
		
		// this will keep track of the multiplication
		int fact = 1;
		
		// keep multiplying until our number reaches 0
		while (num > 0) {
			
			// multiply by our current number
			fact *= num;
			
			// count down to the next number
			num --;
		}
		System.out.println(fact);
	}
	
	// Medium #2
	public void simpleGame() {
		System.out.println("do you want to keep playing?");
		String answer = in.next();
		while (answer.equals("yes")) {
			System.out.println("do you want to keep playing?");
			answer = in.next();
		}
		System.out.println("ok, game over");
	}
	
	// Medium #3
	public void factors() {
		System.out.println("Enter a number");
		int num = in.nextInt();
		int count = 1;
		while (count < num) {
			if (num % count == 0) 
				System.out.println(count);
			count++;
		}
	}
	
	// Hard #1
	public void gcd() {
		System.out.println("Enter 2 numbers");
		int n1 = in.nextInt(), n2 = in.nextInt();
		int count = Math.min(n1, n2);
		while (count >= 1) {
			if (n1 % count == 0 && n2 % count == 0) {
				System.out.println(count);
				break;
			}
			count--;
		}
	}	
	
	// Hard #2
	public void lcm() {
		System.out.println("Enter 2 numbers");
		int n1 = in.nextInt(), n2 = in.nextInt();
		int count = Math.max(n1, n2);
		while (count > 1) {
			if (count % n1 == 0 && count % n2 == 0) {
				System.out.println(count);
				break;
			}
			count++;
		}
	}
	
	// Hard #3
	public void isPrime() {
		
		System.out.println("Enter a number");
		int num = in.nextInt();
		
		int counter = 2;
		
		while (counter < num) {
			
			if (num % counter == 0) {
				System.out.println("not prime");
				break;
			}
			counter ++;
		}
		if (counter >= num) 
			System.out.println("prime");
	}
	
	// Challenge
	public void magicNumbers(int n) {
		
		int numsFound = 0;
		int sqrt = 1;
		while (numsFound < n) {
			
			int testSquare = sqrt*sqrt;
			
			int sum = 0;
			int i = 1;
			while (sum < testSquare) {
				sum += i;
				i++;
			}
			if (sum == testSquare) {
				System.out.println(sum);
				numsFound++;
			}
			sqrt++;
		}
	}

	public static void main(String[] args) {
		MoreWithLoopsCW runner = new MoreWithLoopsCW();
		runner.magicNumbers(4);
	}
}
