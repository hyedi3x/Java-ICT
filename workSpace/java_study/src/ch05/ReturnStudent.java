package ch05;

public class ReturnStudent {
	// [기능을 출력하는 main 함수]
	public static void main(String[] args) {
		Student1 st = new Student1();
		st.setStudentName("홍길동");
		st.getInfo();
	}
}

/*
  main 클래스 외의 외부 클래스를 한 java 파일에 담고 싶을 때 
  class + class명으로 선언한다. 
*/
// [학생 정보가 담긴 Student 클래스] 
class Student1 {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	/* 
	  [학생의 이름을 멤버 변수에 대입하는 함수 생성]
	  set() : 값을 지정받는 메서드
	  - set + 대문자 멤버변수 (자료형 + 멤버변수(매개변수))
	  - this.멤버변수 = 참조변수;	  
	  - 반환 값이 없으므로 반환형을 void로 지정한다.   
	*/
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
		
	/* 
	  [학생의 이름을 반환받는 메서드]
	  get() : 값을 읽어오는 메서드  
	  - get + 대문자 멤버변수()
	  - return 멤버 변수
	  - 반환값이 String 형이므로, 반환형도 String으로 지정 
	*/
	public String getStudentName() {
		return studentName;
	}
	
	// [get으로 받아온 값을 출력하는 클래스 생성] 
	public void getInfo() {
		System.out.println("학생의 이름은 : " + studentName);
	}
		
}
