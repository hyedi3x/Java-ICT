package ch06;

public class StaticClass {
	// [멤버 변수]
	// static 공유 변수를 private로 설정 
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	
	// 디폴트 생성자 
	public StaticClass() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	// static 공유 변수 값을 읽어오는 get()메서드
	public static int getSerialNum() {
		return serialNum;
	}
	
	// serialNum set()메서드
	public static void setSerialNum(int serialNum) {
		StaticClass.serialNum = serialNum;
	}

}
