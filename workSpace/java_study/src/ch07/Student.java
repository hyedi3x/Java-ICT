package ch07;

import java.util.ArrayList;   // ArrayList 클래스 import 

// [과목을 수강하는 학생 클래스]
public class Student {
	// [멤버 변수]
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;  // ArrayList 선언
	
	// [매개변수 생성자]
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>(); // ArrayList 생성
	}
	
	// [과목을 입력받는 함수 생성]
	public void addSubject(String name, int score) {
		// [Subject 클래스형 객체 생성]
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScore(score);
		subjectList.add(subject);  // 배열에 저장		
	}
	
	// [출력 메서드]
	public void showStudentInfo() {
		int total=0;
		
		// [배열 요소 향상된 for문으로 출력]
		for(Subject s : subjectList) {
			total += s.getScore(); // 총점 더하기
			System.out.println("학생 " + studentName + "의 " + s.getName() 
			     + " 과목 성적은 " + s.getScore() + "입니다.");
		}
		System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
	}

}
