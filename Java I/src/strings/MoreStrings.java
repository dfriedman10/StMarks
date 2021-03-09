package strings;

public class MoreStrings {

	public void sameStartandEnd(String a) {
	
		System.out.println(a.substring(0,2)==a.substring(a.length()-2)? "true":"false");
		
	}
	
	public void howManyofDemWOrds(String a, String b) {
		
		
		int count=0;
		
		for(int i = 0; i<a.length(); i++) {
			if(a.charAt(i)== ' ') {
				count++;
			}
			
		}
		System.out.println(count+1);
		
	}
	
	public void noMoreE(String a) {
		for(int i=0; i<a.length();i++) {
			System.out.print(a.charAt(i)=='e'?"":a.charAt(i));
		}
	}
	
	public void letterInTheWord(String a, char c) {
		for(int i=0; i<a.length(); i++) {
			System.out.println(a.charAt(i)==c? a.charAt(i) + ": yes" : a.charAt(i) + ": no");
		}
		
	}
	
	
	
	

	public void withinAword(String a, String b) {
		for(int i=0; i<a.length(); i++) {

				System.out.println(a.substring(i,i+3)==b? " yes":": no");
			
		}
		
		
	}
	
	
	

	public void stringIntoArrays(String a) {
		int counter=0;
		
		for(int i = 0; i<a.length(); i++) {
			if(a.charAt(i)== ' ') {
				counter++;
			}
			
		}
		
		String[]arr = new String[counter+1];
		int count=0;
		for(int i = 0; i<a.length(); i++) {
			if(a.charAt(i)== ' ') {
				arr[i]=a.substring(count,i);
				//System.out.println(a.substring(count,i));
				count=count+i;
			}
			
		}
		for(int i = 0; i<a.length(); i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	
	public void longestRepeat(String b) {
		int count=1;
		int remember=0;
		for(int i=1; i<b.length(); i++) {
			if(b.charAt(i)==b.charAt(i-1)) {
				count++;
			}else {
				if(count>remember) {
					remember=count;
				}
				count=1;
			}

		}
		System.out.println(remember);
	}
	
	public void palindrome(String b) {
		
		if(b.substring(0,b.length()/2)==b.substring(b.length()/2)) {
			System.out.println("yes");
		}
		
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		MoreStrings run = new MoreStrings();
		String a= new String("lets go eat");
		String b= new String("edi");
		char c = 'e';
		run.letterInTheWord(a, c);
		
		
		
	}

}
