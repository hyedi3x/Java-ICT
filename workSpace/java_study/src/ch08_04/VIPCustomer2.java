package ch08_04;

// [자식클래스 : VIPCustomer2 클래스 생성, extends로 Customer2 클래스 상속받음]
// super 사용하여, 부모 클래스 매개변수 생성자 호출
public class VIPCustomer2 extends Customer2 {
	// [멤버 변수]
	private int agentID;  // 고객 상담원
	private double saleRate;  // 할인율
	
	// [매개변수 생성자] 
	public VIPCustomer2(String id, String name, String grade, int agentID, double saleRate) {
		// [부모 클래스 Customer2의 멤버변수에 접근하기 위해 super 예약어 사용]
		super(id, name, grade);
		this.agentID = agentID;  // 고객 상담원
		this.saleRate = saleRate;  // 할인율
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
	@ Override
	public void printInfo() {
		// 부모 메서드 호출(super), 호출 안할 시 자식 정보만 출력됨
		super.printInfo();   
		System.out.println(agentID);
		System.out.println(saleRate);
	}

}
