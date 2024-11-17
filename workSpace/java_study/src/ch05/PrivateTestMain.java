package ch05;

public class PrivateTestMain {
	public static void main(String[] args) {
		// [객체 생성] 
		PrivateTest st = new PrivateTest();
		
		// [set 메서드를 활용해 private 변수에 값 지정]
		st.setStudentName("박은종");
		
		// [get 메서드를 활용해 private 변수 값 읽기]
		System.out.println(st.getStudentName());
	}
}
