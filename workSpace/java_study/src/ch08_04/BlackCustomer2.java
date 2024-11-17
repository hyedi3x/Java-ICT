package ch08_04;

// [자식클래스 : BlackCustomer2 클래스 생성, extends로 Customer2 클래스 상속받음]
// super 사용하여, 부모 클래스 매개변수 생성자 호출
public class BlackCustomer2 extends Customer2 {
	// [멤버 변수] 
	private int penalty;

	// [매개변수 생성자] 
	public BlackCustomer2(String id, String name, String grade, int penalty) {
		// [부모 클래스 Customer2의 멤버변수에 접근하기 위해 super 예약어 사용]
		super(id, name, grade);
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
