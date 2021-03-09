package arrays2d;

public class intro2dArrays {

	public static void main(String[] args) {

		
		int[][] arr = { {1,2,3}, 
						{4,5}, 
						{6,7,8,9} };
		
		
		int[][] arr2 = new int[5][3];
		
		int[][] arr3 = new int[4][];
		
		display(arr3);
		
	}
	
	// str: jimmy  letter1: m   letter2: f
	
	//output: jiffy
	public void replace(String str, char letter1, char letter2 ) {
		
		str = str.substring(0, 2) + "f" + str.substring(3);
		
	}
	
	
	public static void display(int[][] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println();
			
		}
		
		
		
	}

}
