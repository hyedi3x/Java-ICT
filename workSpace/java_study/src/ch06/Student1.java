package ch06;

// [static 변수 사용] 
public class Student1 {
	// [멤버 변수] 
  // [static 공유값(학번) 초기값 - 1000]
	static int serialNum = 1000; 
	int studentID;       // 학번
	String studentName;  // 이름
	
	// [디폴트 생성자]
	public Student1() {
		// 학생이 생성될 때마다 학번 1씩 증가
		serialNum++;    
		
  	// 증가된 값을 studentID 인스턴스 변수에 부여 
		studentID = serialNum;  
	}
	
	// [setter - 아이디값 지정]
	public void setID(int ID) {
		studentID = ID;
	}
	
	// [getter - 아이디값 읽어오기]
	public int getID() {
		return studentID;
	}
	
	
	// [setter - 이름값 지정]
	public void setName(String name) {
		studentName = name;
	}
	
	// [getter - 이름값 읽어오기]
	public String getName() {
		return studentName;
	}
	
	/*
    static 변수 = 클래스 변수 = 공유변수
    - 프로그램이 실행되어 메모리에 올라갔을 때 딱 한번 데이터영역 메모리 공간에 할당된다.
    - 객체를 생성하지 않고, 바로 클래스명으로 접근가능하다.
    - 인스턴스마다 생성되는 변수가 아니라 클래스에 속해 한번만 생성되는 변수이고,
    - 여러 인스턴스가 공유한다.
    - 인스턴스가 생성되지 않아도 사용할 수 있기 때문에 클래스명.static 변수, 클래스명.static 메서드 사용가능
    - static 변수나 메서드는 static 메서드에서 호출가능
      static 메서드에서 인스턴스 변수나 메서드를 호출시 컴파일 오류가 난다.
      static 메서드는 프로그램 실행시 자동으로 메모리에 올라가나, 일반메서드는 객체를 생성해야 메모리에 올라간다. 
   */
}
