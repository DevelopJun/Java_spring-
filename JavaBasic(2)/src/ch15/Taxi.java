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
		System.out.println("�� ������ ��� �ý� ������" + money + "�Դϴ�." );
	}
}
