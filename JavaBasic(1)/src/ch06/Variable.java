package ch06;

public class Variable {

	public static void main(String[] args) {
		
		byte bnum = 127; // 여기서 128로 바꾸면 에러가 나는거지. byte 크기를 초과하니까 재밌네
		
		System.out.println(bnum);
		
		//int num = 123456789;
		long lNum = 123456900000L;
		System.out.println(lNum);
		
	}

}
