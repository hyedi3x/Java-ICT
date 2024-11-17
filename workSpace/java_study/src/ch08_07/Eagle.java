package ch08_07;

// [자식 클래스(Eagle) : 부모 클래스 AnimalPoly를 상속받음] 
public class Eagle extends AnimalPoly {
	@Override
	// [공통 메서드 -> 재정의]
	public void move() {
		System.out.println("독수리가 하늘을 난다.");
	}
	
	// [Ealge 기능 메서드 : flying()]
	public void flying() {
		System.out.println("독수리가 날개를 펴고 하늘을 난다.");
	}
}