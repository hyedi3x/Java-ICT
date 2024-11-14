package ch08_03;

// [클래스를 읽어와 기능을 구현하는 main 클래스]
// 디폴트 생성자로 값 대입 
public class CustomerMain {
	public static void main(String[] args) {
		// [VIPCustomer 자식 클래스 객체 생성] 
		VIPCustomer vip = new VIPCustomer();
		// [부모 클래스 Customer 멤버 변수, set 메서드 상속]
		vip.setId("C1001");  
		vip.setName("홍길동");
		vip.setGrade("VIP");
		
		// [VIPCustomer 클래스 멤버 변수, set 메서드]
		vip.setAgentID(9999);
		vip.setSaleRate(0.01);
		
		// [VIPCustomer 클래스 멤버 변수, 출력 메서드]
		vip.printInfo();
		System.out.println("");
		
		// -------------------
		// [BlackCustomer 자식 클래스 객체 생성] 
		BlackCustomer black = new BlackCustomer();
		// [부모 클래스 Customer 멤버 변수, set 메서드 상속]
		black.setId("C1002");
		black.setName("진상");
		black.setGrade("BLACK");
		
		// [BlackCustomer 클래스 멤버 변수, set 메서드]
		black.setPenalty(1000);		
		// [BlackCustomer 클래스 멤버 변수, 출력 메서드]
		black.printInfo();
		System.out.println("");

	}

}
