package ch08_02;

// [자식 클래스 Cat 생성, extends로 Animal 클래스 상속 받음]
public class Cat extends Animal {
	
	// [디폴트 생성자]
	public Cat() {
		
	}
	
	// [고양이 동작에 대한 기능 메서드]
	public void cry() {
		System.out.println("야옹~~");
	}
	
}
