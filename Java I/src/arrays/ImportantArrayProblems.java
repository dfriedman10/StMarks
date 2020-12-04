package arrays;

public class ImportantArrayProblems {

	public void min(int[] arr) {
		
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
	
	public void avg(int[] arr) {
		
		double sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum/arr.length);
	}
	
	public void search(String[] arr, String keyWord) {
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i].equals(keyWord)) {
				System.out.println(i);
				found = true;
			}
		}
		if (found == false)
			System.out.println(-1);
	}
	
	public void duplicates(int[] arr1, int[] arr2) {
		
		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = 0; j < arr2.length; j++) {
				
				if (arr2[j] == arr1[i]) {
					System.out.println(arr2[j]);
				}	
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		ImportantArrayProblems run = new ImportantArrayProblems();
		
		run.duplicates(new int[] {3, 6, 8, 4}, new int[] {5, 4, 3, 7});
	}

}
