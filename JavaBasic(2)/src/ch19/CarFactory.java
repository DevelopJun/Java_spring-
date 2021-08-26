package ch19;

public class CarFactory {

	private static CarFactory instance = new CarFactory();
	
	public static Car createCar() {
		
		Car car = new Car();
		
		return car;
	}
		
	private CarFactory() {
		
	}
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
			
		}
		return instance;
	}
	
	
}
