package ch05_01;

// Student 클래스 생성 (StudentMain의 설계도)
public class _05_Student {	
	// [멤버 변수(속성)]
	String studentID;    // 학번
	String studentName;  // 학생이름
	char grade;   // 학년
	int age;      // 나이
	String address;   // 주소
	String email;     // 이메일
	
	/*
		메인 메서드(메인 클래스의 메인 기능 동작) : public static void 메서드명 
	  일반 메서드(클래스 기능을 구현) : public void 메서드명 
	*/
	
	// [멤버 메서드(기능, 동작)] 
	public void printInfo() {
		// 멤버 변수의 정보 출력, 메서드는 동작을 구현한다. 
		System.out.println("학번 : " + studentID);
		System.out.println("이름 : " + studentName);
		System.out.println("학년 : " + grade);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("이메일 : " + email);

	}
	
}

