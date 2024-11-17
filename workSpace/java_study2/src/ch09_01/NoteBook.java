package ch09_01;

// [Computer 클래스의 자식 클래스이자, MyNoteBook의 부모 클래스]
// : 부모 클래스의 추상 메서드가 다 구현되지 않아서 abstract class로 표현
public abstract class NoteBook extends Computer {

	@Override
	// [Computer 부모 클래스의 추상 메서드(display) 구현, 재정의]
	public void display() {
		System.out.println("Notebook : display");
		
	}
}
