package ch10;

public class BirthDayTest {

	public static void main(String[] args) {
		
		BirthDay date = new BirthDay();
		date.setYear(2019);
		date.setMonth(12);
		date.setDay(30);
		
//		date.month = 100; 이렇게 맴버변수 제어 해버릴 수가 있는거지 private 안하면 
		
		date.showDate();
	}

}
