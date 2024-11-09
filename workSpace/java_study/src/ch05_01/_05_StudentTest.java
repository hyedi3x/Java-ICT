package ch05_01;

// [Student class에 main() 함수 추가하기] 
public class _05_StudentTest {
	// [멤버 변수]
	int studentID;
	String studentName;
	String address; 
	
	// [멤버 메서드] 
	public String getStudentName() {
		return studentName;
	}

	// [Student 클래스 내부에 main()함수 생성]
	public static void main(String args[]) {
		// [객체 생성]
		_05_StudentTest st = new _05_StudentTest();
		
		// [멤버 변수에 값 대입]
		st.studentID = 241109;  
		st.studentName = "철수";
		st.address = "서울시 마포구"; 
		
		// [출력]
		System.out.println("st.studentID : " + st.studentID);
		System.out.println("st.studentName : " + st.studentName);
		System.out.println("st.address : " + st.address);
		System.out.println("");
		
		System.out.println("getStudentName : " + st.getStudentName());
	}

}
