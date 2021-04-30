package objects;

public class Garage {
	
	private Car[] cars;
	
	public Garage(int n) {
		
		cars = new Car[n];
	}
	
	
	public void addCar(String name, int mileage, int year, int speed, int i) {
		
		cars[i] = new Car(name, mileage, year, speed);
	}
	
	public int totalWorth() {
		
		int tW = 0;
		
		for (int i = 0; i < cars.length; i++) {
			
			if (cars[i] != null)
				tW += cars[i].worth();
		}
		return tW;
	}
	
	public static void main(String[] args) {
		
		Garage g = new Garage(7);
		
		g.addCar("Honda", 10000, 2005, 200, 0);
		g.addCar("Ford", 20000, 2010, 120, 1);
		
		System.out.println( g.totalWorth() );
		
	}

}
