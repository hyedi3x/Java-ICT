package ch09_01;

// [추상클래스인 부모 클래스(computer)를 상속받은 자식 클래스]
// : 부모 클래스의 추상 메서드를 모두 구현했기에 abstract 선언 x
public class Desktop extends Computer {

	@Override
	// [Computer 부모 클래스의 추상 메서드(display) 구현, 재정의]
	public void display() {
		System.out.println("Desktop : display");
		
	}

	@Override
	// [Computer 부모 클래스의 추상 메서드(typing) 구현, 재정의]
	public void typing() {
		System.out.println("Desktop : typing");		
	}

}
