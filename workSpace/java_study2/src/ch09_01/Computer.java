package ch09_01;

// [부모 클래스 : 추상 클래스로 생성] 
// **추상 메서드가 하나라도 있으면 추상 클래스로 선언(abstract)해야 한다.** 
public abstract class Computer {
	
	// [추상 메서드는 구현 x(오로지 선언만)]
	public abstract void display();
	public abstract void typing();
	
	// -----[일반 메서드는 구현]-----------
	public void turnOn() {
		System.out.println("전원을 키다.");
	}

	public void turnOff() {
		System.out.println("전원을 끄다.");
	}

}
