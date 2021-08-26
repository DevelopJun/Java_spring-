package ch15;

public class Taxi {
	
	int money;
	int taxiNumber;
	
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showTaxiinfo() {
		System.out.println("잘 나간다 운수 택시 수입은" + money + "입니다." );
	}
}
