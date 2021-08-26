package ch19;

public class Car {

	private static int CarNum = 10000;
	public String Car;
	
	
	public String getCar() {
		return Car;
	}

	public void setCar(String car) {
		Car = car;
	}
	
	public int getCarNum() {
		
		CarNum++;
		return CarNum;
	}
	
}
