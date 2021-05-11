package lists;
import java.util.ArrayList;

public class ListWarmUp {
	
	public static ArrayList<Integer> squares(int n) {
		
		ArrayList<Integer> squares = new ArrayList<Integer>();
		
		for (int i = 0; i <= n; i++) {
			
			squares.add(i*i);
		}
		
		
		return squares;
	}
	
	public static int[] letterFrequency(ArrayList<String> words) {
		int[] freq = new int[26];
		                  
		for (String word : words) {
			
			word = word.toLowerCase();
			
			for (int i = 0; i < word.length(); i++) {
				
				if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
					
					freq[word.charAt(i) - 97] ++;
					
				}
			}
		}
		return freq;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
