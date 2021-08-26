package ch10;

public class BirthDay {

	private int day;
	private int month;
	private int year; // int 는 default 값 0임
	// public과 private 차이는 맴버 변수의 오용을 객체가 잘 못 사용하는 것을 노출하기 되고, 객체에 문제가 생길 수 도 있는거임. 
	
	private boolean isValid; // default 값 false임
	
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month < 1 || month > 12)
		{
			isValid = false;
		}
		else {
		
			isValid = true;
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if(isValid) {
			System.out.println(year + "년" + month + "월" + day + "일 입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜 입니다.");
		}
	}
}
