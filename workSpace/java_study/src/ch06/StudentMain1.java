package ch06;

public class StudentMain1 {
	public static void main(String[] args) {
		// [Student1 클래스형 인스턴스 생성(st1)] 
		Student1 st1 = new Student1();
		st1.setName("이지원");
		System.out.println(st1.serialNum); 
		System.out.println(st1.getName() + "의 학번은 " + st1.getID());
		System.out.println("");
		
		//----------
		// [Student1 클래스형 인스턴스 생성(st2)] 
		Student1 st2 = new Student1();
		st2.setName("손수경");
		System.out.println(st2.serialNum);
		System.out.println(st2.getName() + "의 학번은 " + st2.getID());
		System.out.println("");
	}
}
