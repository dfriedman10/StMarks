package lists;
import java.util.ArrayList;

public class Searching {
	
	
	public static int binarySearch(ArrayList<Integer> nums, int target, 
			int startI, int endI) {
		
		int midpoint = (startI + endI)/2;
		
		int value = nums.get(midpoint);
		
		if (value == target) {
			return midpoint;
		}
		
		else if (value < target) {
			return binarySearch(nums, target, startI, midpoint-1);
		}
		
		else {
			return binarySearch(nums, target, midpoint+1, endI);
		}
		
		
	}
	

	
	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(3);
		nums.add(6);
		nums.add(9);
		nums.add(10);
		nums.add(15);
		
		
		System.out.println(binarySearch(nums, 15, 0, nums.size()-1));
		
	}
}
