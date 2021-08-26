package ch12;

public class LogicalTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
//		boolean value = ((num1 = num1 + 10) < 10) && ((i = i+2) <10 );
		boolean value = ((num1 = num1 + 10) < 10) || ((i = i+2) <10 );
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); // i가 당연히 4가 될거라고 예상하고 프로그래밍 했지만, 앞에가 false 가 나오면 뒤에가 evaluation 하지 않는다. 
		// 그럼 or 항으로 || 바꾸면 바뀐다. 
		// 근데 또 저렇게 했는데 앞에 항이 True 이면 또 뒤에 영향을 안주는거임.
		
						
	}

}
