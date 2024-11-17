package ch08_07;

// [자식 클래스(Human) : 부모 클래스 AnimalPoly를 상속받음] 
public class Human extends AnimalPoly{
	@Override
	// [공통 메서드 -> 재정의]
	public void move() {
		System.out.println("사람이 움직인다.");
	}
	
	// [Human 기능 메서드 : readBook()]
	public void readBook() {
		System.out.println("사람이 책을 읽는다.");
	}

}
