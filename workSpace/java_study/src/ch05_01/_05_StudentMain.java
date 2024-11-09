package ch05_01;

//[_05_Student 클래스를 불러와 작업을 수행하는 Main 클래스] 
public class _05_StudentMain {
	public static void main(String[] args) {
		/*
		   [객체 생성] 
		   클래스 + 변수 = new 생성자(클래스);
		   변수명(참조변수).멤버변수; or 변수명(참조변수).멤버 메서드;
		*/
		// _05_Student 클래스를 st 변수에 대입
		_05_Student st = new _05_Student(); 
		
		// [멤버변수에 값 대입]
		st.studentID = "241107"; 
		st.studentName = "홍길동"; 
		st.grade = '4'; 
    st.age = 24;		
    st.address = "경기도 고양시"; 
    st.email = "honglidong@gmail.com";
    		
    // [멤버 메서드(printInfo)를 불러옴]  
    System.out.println("== printInfo 메서드 불러오기 ==");
		st.printInfo(); 
		System.out.println("");
		
		/* 
		  [데이터 업데이트] 
		  데이터의 일관성을 해치게 사용시 주의해야한다.  
		  st.studentID 값에 다른 값을 대입 
		*/
		System.out.println("== studentID 값 변경 ==");
		st.studentID = "123456";
		st.printInfo();  
	}
	
}

