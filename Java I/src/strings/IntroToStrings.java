package strings; 

public class IntroToStrings {
	
	public void secondHalf(String word) {
		
		System.out.println(word.substring(word.length()/2));
		
	}
	
	public void contains(String bigWord, String littleWord) {
		
		if (bigWord.indexOf(littleWord) != -1)
			System.out.println("yes");
		
		else
			System.out.println("no");
		
	}
	
	public void firstLast(String word) {
		
		String firstTwo = word.substring(0,2);
		String lastTwo = word.substring(word.length()-3);
		
		if (firstTwo.equals(lastTwo)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
	
	
	public void numWords(String sentence) {
		
		int count = 0;
		
		for (int i = 0; i < sentence.length(); i++) {
			
			if (sentence.charAt(i) == ' ') {
				count++;
			}
			
		}
		System.out.println(count+1);
	}
	
	
	public static void main(String[] args) {
		
		IntroToStrings run = new IntroToStrings();
		run.numWords("hello everyone");
		
	}
}
