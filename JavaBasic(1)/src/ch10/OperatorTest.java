package ch10;

public class OperatorTest {

	public static void main(String[] args) {
		
		int gameScore = 150;
		
//		int lastScore = ++gameScore; // gameScore += 1; gameScore = gameScore +1;
		int lastScore = gameScore++; // 차이가 존재하는거 알지? ++, -- 든 앞에 들어가는지 뒤에 들어가는지에 따라서 달라지는거임. 
		
		
		System.out.println(lastScore);
		System.out.println(gameScore);
		
	}

}
