package ch09;

public class LocalVariable {

	public static void main(String[] args) {

		var i = 10;
		var j = 10.0;
		var str = "test";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str;
		System.out.println(str2);
		
		str = "hello";
//		str = 3; // 스크립 파이썬 언어에서는 데이터 타입 다시 이렇게 int로 바꿀 수 있지만 자바에서는 불가능하다.
		
	}

}
