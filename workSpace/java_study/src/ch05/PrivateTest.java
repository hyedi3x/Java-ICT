package ch05;

// [get( ), set( ) 메서드 사용하기]  
public class PrivateTest {

	// [멤버 변수] 
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	// [private 변수인 studentName에 접근해 값을 가져오는 get( ) 메서드]
	public String getStudentName() {
		return studentName;   // 반환값이 있으므로 반환형을 기재한다. 
	}
	
	// [private 변수인 studentName에 접근해 값을 지정하는 set( ) 메서드]
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
