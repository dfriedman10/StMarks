package arrays;

public class WarmUpJan8 {

	public void weightedSum(double[] nums) {
		
		double sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i]*i;
		}
		System.out.println(sum);
	}
	
	public void combine(char[] letters) {
		
		String str = "";
		
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] >= 'a' && letters[i] <= 'z') {
				str += letters[i];
			}
		}
		
		System.out.println(str);
	}
	
	
	public static void main(String[] args) {
		WarmUpJan8 run = new WarmUpJan8();	
		
		
	}

}
