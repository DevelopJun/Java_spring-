package ch15;

public class TakeTransTaxi {

	public static void main(String[] args) {
		
		Student studentJ = new Student("Edward", 20000);
		
		Taxi taxi100 = new Taxi(100);
		
		studentJ.takeTaix(taxi100);
		
		studentJ.showInfo();
		taxi100.showTaxiinfo();
		
	}

}
