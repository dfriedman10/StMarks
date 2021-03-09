package arrays2d;

public class MoreWith2dArrays {
	
	
	public void display(int[][] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void squareArray(int n) {
		int[][] arr = new int[n][n];
		
		int count = 1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				arr[i][j] = count;
				count++;
				
			}
		}
		display(arr);
		
	}
	
	public void max(double[][] numbers) {
		
		double max = numbers[0][0];
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				
				if (numbers[i][j] > max)
					max = numbers[i][j];
				
			}
		}
		System.out.println(max);
	}

	
	public static void main(String[] args) {
		MoreWith2dArrays run = new MoreWith2dArrays();
		
		double[][] arr = {{6,3,2}, {5,2,8}, {1}};
		
		run.max(arr);
	}
}
