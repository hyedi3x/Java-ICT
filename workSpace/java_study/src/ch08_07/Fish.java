package ch08_07;

// [자식 클래스(Fish) : 부모 클래스 AnimalPoly를 상속받음] 
public class Fish extends AnimalPoly {
	@Override
	// [공통 메서드 -> 재정의]
	public void move() {
		System.out.println("물고기가 헤엄친다.");
	}
	
	// [Fish 기능 메서드 : eating()]
	public void eating() {
		System.out.println("물고기가 배부를때까지 이끼를 먹는다.");
	}
}
