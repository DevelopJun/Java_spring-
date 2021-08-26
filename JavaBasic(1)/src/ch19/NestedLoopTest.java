package ch19;

public class NestedLoopTest {

	public static void main(String[] args) {
		
		int dan = 2;
		int count = 1;
		
		for( ; dan <= 9; dan++) {
			
			for( count =1; count <=9; count++) {
				System.out.println(dan + "X" + count + "=" + dan*count);
			}
		}
		
		dan = 2;
		while(dan <= 9) {
			
			count = 1; //초기화 해줘야함. 
			while(count <= 9) {
				System.out.println(dan + "X" + count + "=" + dan*count);
				count++;
			}
			dan++;
		}
		
	}

}
