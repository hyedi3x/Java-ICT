package ch06;

public class StaticClassMain {
	public static void main(String[] args) {
		StaticClass sc1 = new StaticClass();
		sc1.setStudentName("홍길동");
		System.out.println(StaticClass.getSerialNum());  // serialNum 값 읽어오는 메서드
		System.out.println("이름 : " + sc1.studentName + ", 학번 : " + sc1.studentID);
		
		StaticClass sc2 = new StaticClass();
		sc2.setStudentName("이순신");
		System.out.println(StaticClass.getSerialNum());  // serialNum 값 읽어오는 메서드
		System.out.println("이름 : " + sc2.studentName + ", 학번 : " + sc2.studentID);

	}

}
