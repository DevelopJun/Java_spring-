package ch09;

public class SubjectTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "lee");
		studentLee.setkoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 99);

		Student studentjune = new Student(200, "jung");
		studentjune.setkoreaSubject("국어", 50);
		studentjune.setMathSubject("수학", 65);
		
		studentLee.showScoreInfo();
		studentjune.showScoreInfo();
	}

}
