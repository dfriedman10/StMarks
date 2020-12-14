package arrays;
import java.util.Scanner;

public class StartingArraysSolutions {
	
	public void display(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			
			// so that we don't print out a comma after the last number
			if (i != arr.length-1)
				System.out.print(", ");
		}
		System.out.print("]");
	}	
	
	public void oneToN(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		display(arr);
	}
	
	public void swap(int[] arr) {
		int first = arr[0];
		int last = arr[arr.length-1];
		arr[0] = last;
		arr[arr.length-1] = first;
		
		display(arr);
	}
	
	public void userArray() {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[7];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a number");
			arr[i] = in.nextInt();
		}
		System.out.println("Your array is:");
		display(arr);
	}
	
	public void reverse(int[] arr) {
		
		// make a new array that's the same size as the input
		int[] reversedArray = new int[arr.length];
		
		int backIndex = arr.length-1;
		
		for (int i = 0; i < arr.length; i++) {
			reversedArray[i] = arr[backIndex];
			backIndex--;
		}
		display(reversedArray);
	}

	
	


	public static void main(String[] args) {
		StartingArraysSolutions tester = new StartingArraysSolutions();
		
		int[] arr = {5,9,0,4,2};
		
		//tester.display(arr);
		//tester.oneToN(100);
		//tester.swap(arr);
		//tester.userArray();
		tester.reverse(arr);
	}

}
