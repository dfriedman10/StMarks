package introductionToJava;

public class FinalIntroSolutions {
	
	public void distance(double x1, double y1, double x2, double y2) {
		System.out.println(Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)));
	}
	
	public void quadratic(double a, double b, double c) {
		double soln1 = -b + Math.sqrt(b*b - 4*a*c)/(2*a);
		double soln2 = -b - Math.sqrt(b*b - 4*a*c)/(2*a);
		
		System.out.println(soln1);
		if (soln1 != soln2)
			System.out.println(soln2);
	}
	
	public void charAverage(char c1, char c2) {
		System.out.println((char)((c1 +c2)/2));
	}
	
	
	public static void main(String[] args) {
		
		FinalIntroSolutions tester = new FinalIntroSolutions();
		
		// prints out the distance between two points
		// output should be 6.83
		tester.distance(1, -2.5, 3.1, 4);
		
		// prints out a solution to y = ax^2 + bx + c, where the 
		// three parameters are a, b, and c. Use the quadratic equation
		// output should be 2 or -2 (challenge: give both solutions)
		tester.quadratic(1, 0, -4);
		
		// prints out the 'average' of two characters
		// output should be 'W'
		tester.charAverage('m', 'A');
	}

}
