package ch08_05;

// [부모 + 자식 클래스 매개변수 생성자 사용하기, protected 사용]
public class CustomerMain3 {
	public static void main(String[] args) {
		// [자식 클래스 VIPCustomer3 객체 생성] 
		System.out.println("==== VIPCustomer3 ===");
		
		// [부모 클래스 멤버변수를 default 값으로 VIPCustomer3에 대입해서 ""으로 표시]
		VIPCustomer3 vip = new VIPCustomer3("", "", "", 7777, 0.10);
		
		// [VIPCustomer3 클래스 멤버 변수, 출력 메서드]
		vip.printInfo();
		System.out.println("");
		
		//-----------------
		// [자식 클래스 BlackCustomer3 객체 생성] 
		System.out.println("==== BlackCustomer3 ===");
		
		// [부모 클래스 멤버변수를 default 값으로 BlackCustomer3에 대입해서 ""으로 표시]
		BlackCustomer3 warnning = new BlackCustomer3("", "", "", 666);
		
		// [BlackCustomer3 클래스 멤버 변수, 출력 메서드]
		warnning.printInfo();
		
	}

}
