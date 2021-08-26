package ch03;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentjune = new Student();
		
		studentjune.studentID = 12345;
		studentjune.setStudentName("Jung");
		studentjune.address = "서울 신사동";
		
		studentjune.showStudentInfo();
		
		Student duyong = new Student();
		studentjune.studentID = 78565;
		studentjune.setStudentName("Jung");
		studentjune.address = "서울 화곡동";
		
		studentjune.showStudentInfo();
		System.out.println(studentjune);
		System.out.println(duyong);
	}

}
