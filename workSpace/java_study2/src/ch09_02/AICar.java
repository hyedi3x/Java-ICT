package ch09_02;

// [Car 부모 클래스를 상속받은 AICar 클래스]
// : 추상메서드를 모두 구현하여 일반 클래스로 선언
public class AICar extends Car {

	// ------[drive 추상메서드 구현]------
	@Override
	public void drive() {
		System.out.println("자율 주행을 시작합니다.");
		System.out.println("방향을 자동으로 전환합니다.");
	}

	// ------[stop 추상메서드 구현]------
	@Override
	public void stop() {
		System.out.println("스스로 주행을 멈춥니다.");
	}

}
