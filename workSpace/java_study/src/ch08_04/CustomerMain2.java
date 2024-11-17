package ch08_04;

// [부모 + 자식 클래스 매개변수 생성자 사용하기]
public class CustomerMain2 {
	public static void main(String[] args) {
		// [자식 클래스 VIPCustomer2 객체 생성] 
		System.out.println("==== VIPCustomer2 ===");
		VIPCustomer2 vip = new VIPCustomer2("C1003", "이순신", "VIP", 8888, 0.05);
		
		// [VIPCustomer2 클래스 멤버 변수, 출력 메서드]
		vip.printInfo();
		System.out.println("");
		
		//------------------------
		// [자식 클래스 BlackCustomer2 객체 생성] 
		System.out.println("==== BlackCustomer2 ===");
		BlackCustomer2 warnning = new BlackCustomer2("C1004", "진상2", "BLACK", 500);
		
		// [BlackCustomer2 클래스 멤버 변수, 출력 메서드]
		warnning.printInfo();
	}

}
