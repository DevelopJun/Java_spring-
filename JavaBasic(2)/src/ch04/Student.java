package ch04;

public class Student {
	
	public int studentNumber;
	public String studentName;
	public int grade;
	//������ �� �ɹ� �����ΰ���. �������� �ƴ�.
	
	public Student() {}
	
	
	public Student(int studentNumber, String studentName, int grade) {
		
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		
		//�ɹ� ������ ��ü�� �����ɶ� �ڱⰡ ���� �Ķ������ ���� �ڱ� �ɹ������� �־��ִ°� ������ ���� 
		
	}
	
	public String showStudentInfo() {
		
		return studentNumber + "�л��� �й���" + studentNumber + "�̰�, " + grade + "�г� �Դϴ�.";
	}
}
