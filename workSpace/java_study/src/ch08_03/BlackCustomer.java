package ch08_03;

// [자식클래스 : BlackCustomer 클래스 생성, extends로 Customer 클래스 상속받음]
// 디폴트 생성자 활용
public class BlackCustomer extends Customer {
	// [멤버 변수] 
	private int penalty;  // 패널티 
	
	// [디폴트 생성자]
	public BlackCustomer() {
		super();  // 부모(상위) 클래스의 디폴트 생성자를 먼저 출력하겠다. 
		System.out.println("=== BlackCustomer 정보 ===");

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
