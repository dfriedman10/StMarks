package lists;

import java.util.ArrayList;

public class ListCW2 {

	public static void sort(int n, int x) {
		ArrayList<Integer> randoms = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i ++) {
			randoms.add((int)(Math.random()*2*x - x));
		}
		ArrayList<Integer> pos = new ArrayList<Integer>();
		ArrayList<Integer> neg = new ArrayList<Integer>();

		for (int num : randoms) {
			if (num >= 0)
				pos.add(num);
			else
				neg.add(num);
		}
		System.out.println(pos);
		System.out.println(neg);
	}
	
	public static void reverse(ArrayList<Double> nums) {
		
		for (int i = 0; i < nums.size(); i++) {
			nums.add(i, nums.remove(nums.size()-1));
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Double> nums = new ArrayList<Double>();
		nums.add(7.8);
		nums.add(3.1);
		nums.add(5.5);
		nums.add(6.2);
		reverse(nums);
		System.out.println(nums);

	}

}
