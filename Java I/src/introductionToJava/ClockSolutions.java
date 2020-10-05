package introductionToJava;
public class ClockSolutions {
	private int minutes;
	
	public void setTime(int min) {
		minutes = min;
	}
	
	public void tick() {
		minutes = (minutes+1)%60;
	}
	public void displayTime() {
		System.out.println(minutes);
	}
	
	public static void main(String[] args) {
		ClockSolutions tester = new ClockSolutions();
		
		// should display the time to be 57, 58, 59, 0, 1, etc.
		tester.setTime(56);
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
	}
}