package ch10;

public class OperatorTest {

	public static void main(String[] args) {
		
		int gameScore = 150;
		
//		int lastScore = ++gameScore; // gameScore += 1; gameScore = gameScore +1;
		int lastScore = gameScore++; // ���̰� �����ϴ°� ����? ++, -- �� �տ� ������ �ڿ� �������� ���� �޶����°���. 
		
		
		System.out.println(lastScore);
		System.out.println(gameScore);
		
	}

}
