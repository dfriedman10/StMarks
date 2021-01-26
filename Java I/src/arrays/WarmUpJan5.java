package arrays;
import java.util.Arrays;

public class WarmUpJan5 {

	public void average(int[] nums) {
		
		double sum = 0;
		for (int i = 0; i < nums.length; i++) {
			
			sum += nums[i];
		}
		System.out.println(sum/nums.length);
	}
	
	public void trim(int[] nums) {
		
		int min = nums[0], max = nums[0];
		
		for (int i = 0; i < nums.length; i++) {
			if (min > nums[i])
				min = nums[i];
			else if (max < nums[i])
				max = nums[i];
		}
		
		int[] trimmedArray = new int[nums.length-2];
		
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != min && nums[i]!= max) {
				trimmedArray[j] = nums[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(trimmedArray));
		
	}
	
	
	public void fib(int n) {
		
		int[] sequence = new int[n];
		sequence[0] = 1;
		sequence[1] = 1;
		
		for (int i = 2; i < sequence.length; i++) {
			sequence[i] = sequence[i-1] + sequence[i-2];
		}
		
		System.out.println(Arrays.toString(sequence));
		
	}
	
	public static void main(String[] args) {
		
		WarmUpJan5 run = new WarmUpJan5();
		int[] nums = {4, 1};
		//run.average(nums);
		run.fib(15);
	}
}
