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
		Subject subject = new Subject(); // 객체를 만드는거임.
		
		subject.setSubjectName(SubjectName);
		subject.setScore(score);
		subjectList.add(subject);
	}
	
	
	
	public void showScoreInfo() {
		
		int total = 0;
		
		for ( Subject subject: subjectList) {
			
			total += subject.getScore();
			System.out.println(student + "학생의" + subject.getSubjectName() + "과목의 성적은" + subject.getScore() + "입니다.");
		}
		
		System.out.println(student + "학생의 총점은" + total + "점입니다.");
	}

	
}






