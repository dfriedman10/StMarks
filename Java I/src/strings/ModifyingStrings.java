package strings;

public class ModifyingStrings {

	public void lyToEst(String word) {
		
		word = word.substring(0,word.length()-2) + "est";
		
		System.out.println(word);
		
	}
	
	public void preToUn(String word) {
		
		word = "un" + word.substring(3);
		
		System.out.println(word);
	}
	
	public void changeEToQ(String word) {
		
		word = "hello everyone";
		
		for (int i = 0; i < word.length(); i ++) {
			if (word.charAt(i) == 'e') {
				
				word = word.substring(0,i) + "q" + 
						word.substring(i+1);
				
			}
		}
		System.out.println(word);
	}
	
	
	public static void main(String[] args) {
		ModifyingStrings run = new ModifyingStrings();
		
		run.lyToEst("sickly");
		run.preToUn("predisposed");
	}
}
