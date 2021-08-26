package ch16;

import java.util.Scanner;

public class SwitchCaseTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int day;
		switch(month) {
		
		case 1: case 3: case 5: // 이런식으로 적어도 된다.
			// 이것도 귀찮으면 case 1, 3, 5, 7, 8, 10, 12 -> 이런식으로 적어도 된다.
//		case 1, 3, 5 ->
			day = 31;
			break;
		case 2: 
			day = 28;
			break;
//		case 3: 
//			day = 31;
//			break;
		case 4: 
			day = 30;
			break;
//		case 5:
//			day = 31;
//			break;
		case 6: 
			day = 31;
			break;
		case 7: 
			day = 31;
			break;
		case 8: 
			day = 31;
			break;
		case 9: 
			day = 30;
			break;
		case 10: 
			day = 31;
			break;
		case 11: 
			day = 30;
			break;
		default:
			System.out.println("존재하지 않는 달입니다.");
			day = -1;
		}
		
		System.out.println(month + "월은" + day + "일입니다");
		
	}
}
