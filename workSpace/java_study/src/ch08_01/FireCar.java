package ch08_01;

// [자식 클래스 : 소방차 클래스 생성]
public class FireCar extends Car  {

	// [디폴트 생성자] 
	public FireCar() {
		
	}

	// [물을 뿌리는 기능의 메서드] 
	public void water() {
		System.out.println("소방차의 기능 : 물을 뿌리다.");
	}

}
