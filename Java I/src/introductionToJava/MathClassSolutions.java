package introductionToJava;

public class MathClassSolutions {
	
	private int key;
	
	// an example method to use as a guideline
	public void halve(int x) {
		System.out.println(x/2);
	}
	
	// I'll give you the first method's outline to fill in. For the rest, you're in charge of 
	// declaring the entire method.
	public void square(int x) {
		
		System.out.println(x*x);
	}
	
	public void average_five(int n1, int n2, int n3, int n4, int n5) {
		System.out.println((n1+n2+n3+n4+n5)/5);
	}
	
	public void raise_to_the_fourth(int x) {
		System.out.println(x*x*x*x);
	}
	
	public void set_key(int x) {
		key = x;
	}
	
	public void multiply_by_key(int x) {
		System.out.println(key*x);
	}
	
	public void key_cubed() {
		System.out.println(key*key*key);
	}
	
	public void make_integer(double x) {
		System.out.println((int)x);
	}
	
	public void round_to_nearest_whole(double x) {
		System.out.println((int)(x+.5));
	}
	
	
	
	public static void main(String args[]) {
		
		MathClassSolutions tester = new MathClassSolutions();
		
		// example method
		// output: 4
		tester.halve(8);
		
		// you are in charge of making the rest of these work
		
		// output: 49
		tester.square(7);
		
		// output: 7
		tester.average_five(7,10,5,7,6);
		
		// output: 81
		tester.raise_to_the_fourth(3);
		
		// output: nothing, just save the number 4
		tester.set_key(4);
		
		// output: 28
		tester.multiply_by_key(7);
		
		// output: 64
		tester.key_cubed();
		
		// output: 3
		tester.make_integer(3.756);
		
		// output: 8
		tester.round_to_nearest_whole(7.8);
	}

}
