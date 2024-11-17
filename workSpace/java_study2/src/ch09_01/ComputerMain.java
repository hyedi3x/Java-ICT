package ch09_01;

public class ComputerMain {
	public static void main(String[] args) {
		System.out.println("=== Computer 클래스형으로 선언, Desktop으로 인스턴스 생성 ===");
		// [클래스형 선언 : Computer 클래스, new Desktop : 생성된 인스턴스]
		Computer desk = new Desktop();
		// [부모 클래스 메서드들만 호출 가능]
		// : 주소는 부모클래스이지만, 자식 클래스의 메서드가 불러와짐(재정의)
		desk.display();  // Computer의 추상 메서드
		desk.typing();   // Computer의 추상 메서드 
		desk.turnOn();
		desk.turnOff();
		
		System.out.println();
		// [클래스형 선언: Computer 클래스, new Desktop : 생성된 인스턴스]
		// 추상클래스는 new로 인스턴스 생성이 불가하다.(불완전하기때문) [new NotoBook 불가]
		System.out.println("=== Computer 클래스형으로 선언, MyNoteBook으로 인스턴스 생성 ===");
		Computer myNotebook = new MyNoteBook();
		myNotebook.display();  // Computer의 추상 메서드 
		myNotebook.typing();   // Computer의 추상 메서드 
		myNotebook.turnOn();
		myNotebook.turnOff();

		System.out.println();
		// [클래스형 선언: NoteBook 클래스, myNotebook 다운캐스팅]
		System.out.println("=== NoteBook 클래스형으로 선언, myNoteBook 다운캐스팅 ===");
		NoteBook notebook = (NoteBook)myNotebook;
		notebook.display(); // NoteBook의 추상 메서드 
		notebook.typing();  // Computer의 추상 메서드 
		notebook.turnOn();
		notebook.turnOff();
		
	}

}
