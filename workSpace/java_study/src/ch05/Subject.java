package ch05;

// [과목 클래스]
public class Subject {
	String subjectName;   // 과목 이름
	int scorePoint;       // 과목 점수
}

// [성적 클래스]
class Student2 {
	int sudentID;        // 학생 학번
	String studentName;  // 학생 이름
	
	// [Subject 클래스형 참조]
	Subject korean;  // 국어
	Subject math;  	 // 수학
}
