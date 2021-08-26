package ch04;

public class Student {
	
	public int studentNumber;
	public String studentName;
	public int grade;
	//위에는 다 맴버 변수인거임. 지역변수 아님.
	
	public Student() {}
	
	
	public Student(int studentNumber, String studentName, int grade) {
		
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		
		//맴버 변수에 객체가 생성될때 자기가 맡은 파라미터의 값을 자기 맴버변수에 넣어주는게 생성자 역할 
		
	}
	
	public String showStudentInfo() {
		
		return studentNumber + "학생의 학번은" + studentNumber + "이고, " + grade + "학년 입니다.";
	}
}
