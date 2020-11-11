package loops;

import java.util.Scanner;

public class NestedLoopsCW {

	
	public void aToZ() {
		for (char letter = 'a'; letter <= 'z'; letter++)
			System.out.println(letter);
	}
	
	public void sum(int x) {
		int sum = 0; 
		for (int i = 0; i <= x; i++)
			sum += i;
		System.out.println(sum);
	}
	
	public void riddle() {
		Scanner in = new Scanner(System.in);
		System.out.println("What is 1 plus 0");
		for (String guess = in.next(); !guess.equals("2"); guess = in.next())
			System.out.println("Try again");
		System.out.println("Correct!");
	}
	
	public void multiplicationTable() {
		for (int row = 1; row <= 12; row++) {
			for (int col = 1; col <= 12; col++) {
				System.out.print(row*col + " ");
			}
			System.out.println();
		}
	}
	
	public void primes(int x) {
		for (int testNum = 2; testNum <= x; testNum++) {
			
			boolean factorFound = false;
			for (int n = 2; n < testNum; n++) {
				if (testNum % n == 0) 
					factorFound = true;
			}
			if (!factorFound)
				System.out.println(testNum);
		}
	}
	
	public void pascal(int x) {
		for (int row = 0; row < x; row++) {
			
			int val = 1;
			System.out.print("1 ");
			for (int col = 1; col <= row; col++) {
				val = val * (row - col + 1) / col;
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}
	
	public void printX(int x) {
		for (int row = 0; row < x; row++) {
			for (int col = 0; col < x; col++) 
				if (col == x - row - 1 || col == row) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		NestedLoopsCW runner = new NestedLoopsCW();
		runner.pascal(6);
		runner.printX(6);
		runner.printX(3);
	}
}
