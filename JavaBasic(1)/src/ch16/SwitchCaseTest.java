package ch16;

import java.util.Scanner;

public class SwitchCaseTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int day;
		switch(month) {
		
		case 1: case 3: case 5: // �̷������� ��� �ȴ�.
			// �̰͵� �������� case 1, 3, 5, 7, 8, 10, 12 -> �̷������� ��� �ȴ�.
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
			System.out.println("�������� �ʴ� ���Դϴ�.");
			day = -1;
		}
		
		System.out.println(month + "����" + day + "���Դϴ�");
		
	}
}