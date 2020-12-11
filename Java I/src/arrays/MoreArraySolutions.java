package arrays;


public class MoreArraySolutions {
	
	public void display(String[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			
			// so that we don't print out a comma after the last number
			if (i != arr.length-1)
				System.out.print(", ");
		}
		System.out.print("]");
	}
	
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
	
	public void average(double[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum/arr.length);
	}
	
	public void negpos(int[] arr) {
		String[] words = new String[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				words[i] = "pos";
			else 
				words[i] = "neg";
		}
		display(words);
	}
	
	public void merge(int[] arr1, int[] arr2) {
		int[] mergedArray = new int[arr1.length+arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			mergedArray[i] = arr1[i];
		}
		for (int i = arr1.length; i < mergedArray.length; i++) {
			mergedArray[i] = arr2[i-arr1.length];
		}
		display(mergedArray);
	}
	
	public void containsLetter(char[] arr, char letter) {
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == letter) {
				System.out.println("Contains "+letter);
				found = true;
				break;
			}
		}
		if (!found)
			System.out.println("Does not contain "+letter);
	}
	
	public void stringIndex(String[] arr, String word) {
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (word.equals(arr[i])) {
				System.out.println(i);
				found = true;
				break;
			}
		}
		if (!found)
			System.out.println(-1);
	}
	
	public void commonNumbers(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}
	
	public void digitsToArray(int n) {
		int[] digitArray = new int[(int)(Math.log(n)/Math.log(10))+1];

		for (int i = digitArray.length-1; i >= 0; i--) {
			digitArray[i] = n % 10;
			n/=10;
		}
		display(digitArray);
	}
	
	public void removeDuplicates(int[] arr) {
		int numDuplicates = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					numDuplicates++;
					break;
				}
				
			}
		}
		System.out.println(numDuplicates);
		
		int[] newArr = new int[arr.length - numDuplicates];
		for (int i = 0, k = 0; i < arr.length; i++) {
			boolean found = false;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					found = true;
					break;
				}
			}
			if (!found) {
				newArr[k] = arr[i];
				k++;
			}
		}
		display(newArr);
	}
	
	
	public static void main(String[] args) {
		MoreArraySolutions tester = new MoreArraySolutions();
		int[] myarray = {1,-6,2,8, 1, 1, 2, -6, 3};
		int[] myarray2 = {4, 1, 3, 2};
		tester.removeDuplicates(myarray);
	}

}
