package ch09;

public class SubjectTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "lee");
		studentLee.setkoreaSubject("����", 100);
		studentLee.setMathSubject("����", 99);

		Student studentjune = new Student(200, "jung");
		studentjune.setkoreaSubject("����", 50);
		studentjune.setMathSubject("����", 65);
		
		studentLee.showScoreInfo();
		studentjune.showScoreInfo();
	}

}
