package ch08_03;

// [자식클래스 : VIPCustomer 클래스 생성, extends로 Customer 클래스 상속받음]
// 디폴트 생성자 활용
public class VIPCustomer extends Customer {
	// [멤버 변수]
	private int agentID;      // 고객 상담원
	private double saleRate;  // 할인율
	
	// [디폴트 생성자] 
	public VIPCustomer(){
		super();  // 부모(상위) 클래스의 디폴트 생성자를 먼저 출력하겠다. 
		System.out.println("=== VIP 정보 ===");

	}

	// [get(), set()] 
	public int getAgentID() {
		return agentID;
	}
	
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	public double getSaleRate() {
		return saleRate;
	}
	
	public void setSaleRate(double saleRate) {
		this.saleRate = saleRate;
	}
	
	// [출력 메서드] 
	/* 
	  [오버라이딩 : 재정의]
	  부모의 메서드를 재정의하며, 자식의 메서드가 실행된다.(전제조건 : 상속)
	  - 부모와 자식 클래스의 멤버 메서드명이 중복될때, 
	  - 부모한테 있는 메서드를 무시하고, 자식한테 있는 메서드만 출력됨 
	  - 부모 메서드의 반환형, 메서드명, 매개변수 개수와 자료형이 자식 메서드와 모두 같아야 한다.
	 */
	@ Override
	public void printInfo() {
		// 부모 메서드 호출 예약어(super), 호출 안할 시 자식 정보만 출력됨
		super.printInfo();   
		System.out.println(agentID);
		System.out.println(saleRate);
	}

}
