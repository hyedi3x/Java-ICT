package ch09_02;

// [Car 부모 클래스를 상속받은 ManualCar 클래스]
// : 추상메서드를 모두 구현하여 일반 클래스로 선언
public class ManualCar extends Car{
	
	// ------[drive 추상메서드 구현]------
	@Override
	public void drive() {
		System.out.println("사람이 직접 운전합니다.");
		System.out.println("사람이 직접 방향을 전환합니다.");
	}

	// ------[stop 추상메서드 구현]------
	@Override
	public void stop() {
		System.out.println("브레이크를 밟고 정지합니다.");
	}

}
