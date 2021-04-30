package objects;

public class Car {
	
	private String name;
	private int mileage, year, topSpeed;
	
	public Car(String n, int m, int y, int tS) {
		name = n;
		mileage = m;
		year = y;
		topSpeed = tS;
	}
	
	public void drive(int howFar) {
		
		mileage += howFar;
	}
	
	public int worth() {
	
		return year % 10 * 1000 + topSpeed*100;
	}
}
