package lists;

import java.util.ArrayList;

public class ListCW1 {

	
	public static int sum(ArrayList<Integer> nums) {
		
		int count = 0;
		
		for (int i = 0; i < nums.size(); i++) {
			count += nums.get(i);
		}
		
		return count;
	}
	
	public static void removeAll(ArrayList<String> words) {
		
		while (words.size() > 0) {
			
			words.remove(0);
		}
	}
	
	public static double avg(ArrayList<Integer> nums) {
		
		
		double count = 0;
		
		for (int i = 0; i < nums.size(); i++) {
			count += nums.get(i);
		}
		
		return count/nums.size();
	}
	
	
	public static int min(ArrayList<Integer> nums) {
		
		
		
	}
	
	public static ArrayList<Integer> fib(int n) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(0);
		nums.add(1);
		
		for (int i = 0; nums.size() < n ; i++) {
			nums.add(nums.get(i) + nums.get(i+1));
		}
		
		return nums;
	}
	
	
	public static ArrayList<Integer> factors(int n) {
		
		ArrayList<Integer> facs = new ArrayList<Integer>();
		
		for (int i = 1; i <= n; i++) {
			
			if (n % i == 0) {
				facs.add(i);
			}
			
		}
		return facs;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(factors(100));
		

		
	}
	
	
}
