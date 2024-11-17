package ch09_02;

public class CarMain {
	public static void main(String[] args) {
		System.out.println("=== 자율 주행 자동차 ===");
		// ------[다형성 적용]------
		// Car 클래스형으로 선언한 참조변수에 자식 클래스(AICar) 인스턴스 생성
		Car ai = new AICar(); 
		ai.run();   // 템플릿 메서드
		
		System.out.println("=== 일반 자동차 ===");
		// Car 클래스형으로 선언한 참조변수에 자식 클래스(ManualCar) 인스턴스 생성
		Car mn = new ManualCar(); 
		mn.run();   // 템플릿 메서드
	}

}
