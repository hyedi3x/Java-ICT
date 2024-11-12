package ch07;

// [Subject 클래스와 Student 클래스를 동작하는 main 클래스]
public class StudentMain {
	public static void main(String[] args) {
		// [Student 클래스형을 통한 st1 인스턴스 생성]
		Student st1 = new Student(1001, "이순신");
		st1.addSubject("국어", 100);
		st1.addSubject("수학", 70);
		
		// [Student 클래스형을 통한 st2 인스턴스 생성]
		Student st2 = new Student(1002, "홍길동");
		st2.addSubject("국어", 80);
		st2.addSubject("수학", 90);
		st2.addSubject("영어", 20);
		
		// [st1 정보 출력]
		st1.showStudentInfo();
		System.out.println("");
		
		// [st2 정보 출력]
		st2.showStudentInfo();
	}

}
