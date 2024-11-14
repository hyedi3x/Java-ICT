package ch08_02;

// [자식 클래스 Dog 생성, extends로 Animal 클래스 상속 받음]
public class Dog extends Animal {
	// [디폴트 생성자]
	public Dog() {
		
	}
	
	// [강아지 동작에 대한 기능]
	public void bark() {
		System.out.println("왈왈~~");
	}
	
}
