package ch05_01;

//[2개 이상의 인스터스 생성하기] 
public class _05_InstanceStudent {
	public static void main(String[] args) {
		
		// [_05_Student 클래스를 student1 변수에 대입, 인스턴스 1]
		_05_Student student1 = new _05_Student(); 
		student1.studentName = "영희"; 
		System.out.println("student1.studentName : " + student1.studentName);

		// [_05_Student 클래스를 student2 변수에 대입, 인스턴스 2]
		_05_Student student2 = new _05_Student(); 
		student2.studentName = "철수"; 
		System.out.println("student2.studentName : " + student2.studentName);

	}
	
}