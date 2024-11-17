package ch09_01;

/*[Computer 클래스의 손자 클래스이자, NoteBook의 자식 클래스]
  : 부모 클래스인 NoteBook 클래스에서 정의 안한 추상 메서드(typing) 구현
  : 조상 클래스인 Computer 클래스의 추상 메서드를 모두 재정의한것이기에 concrete class로 표현
*/ 
public class MyNoteBook extends NoteBook {
	@Override
	// [Computer 조상 클래스의 추상 메서드(typing) 구현, 재정의]
	public void typing() {
		System.out.println("MyNotebook : typing");
		
	}
}
