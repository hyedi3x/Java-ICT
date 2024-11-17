package ch08_05;

// [자식클래스 : BlackCustomer3 클래스 생성, extends로 Customer3 클래스 상속받음]
// super 사용하여, 부모 클래스 매개변수 생성자 호출
public class BlackCustomer3 extends Customer3 {
	// [멤버 변수] 
	private int penalty;
	
	// [디폴트 생성자]
	public BlackCustomer3() {
		
	}
	
	// [매개변수 생성자] 
	public BlackCustomer3(String id, String name, String grade, int penalty) {
		// [부모 클래스 Customer의 멤버변수에 접근하기 위해 super 예약어 사용]
		// super(id, name, grade); 
		
		// [부모 매개 변수가 protected 일 때 super.멤버변수 선언]
		// 멤버변수 값 대입 좋지 않은 방법임
		super.id = "C006";   
		super.name = "진상2";   
		super.grade = "BLACK";  
		this.penalty = penalty;
	}
	
	// [get(), set()] 
	public int getPenalty() {
		return penalty;
	}
	
	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}
	
	// [출력 메서드] 
	@ Override
	public void printInfo() {
		// 부모 메서드 호출 예약어(super), 호출 안할 시 자식 정보만 출력됨
		super.printInfo(); 
		System.out.println(penalty);
	}

}
