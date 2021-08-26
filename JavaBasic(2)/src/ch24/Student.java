package ch24;

import java.util.ArrayList;

public class Student {

	public int studentNumber;
	public String student;
	ArrayList<Subject> subjectList;
	
	public Student(int studentNumber, String student) {
		this.studentNumber = studentNumber;
		this.student = student;
	
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String SubjectName, int score) {
		Subject subject = new Subject(); // ��ü�� ����°���.
		
		subject.setSubjectName(SubjectName);
		subject.setScore(score);
		subjectList.add(subject);
	}
	
	
	
	public void showScoreInfo() {
		
		int total = 0;
		
		for ( Subject subject: subjectList) {
			
			total += subject.getScore();
			System.out.println(student + "�л���" + subject.getSubjectName() + "������ ������" + subject.getScore() + "�Դϴ�.");
		}
		
		System.out.println(student + "�л��� ������" + total + "���Դϴ�.");
	}

	
}






