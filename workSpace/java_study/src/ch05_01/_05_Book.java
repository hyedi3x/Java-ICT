package ch05_01;

// 클래스 알아보기
public class _05_Book {
	/*
  	클래스 : 객체에 대한 설계도, 디자인 
  	- 멤버 변수(속성) + 멤버메서드 (기능, 동작)
  
  	객체 : 클래스를 바탕으로 만들어진 힙 메모리 공간
	 */
	
	// [멤버변수(속성)]
  char bookNo;      // 책 번호 
	String bookTitle; // 책제목
	String author;    // 책저자 
	
	// [멤버 메서드(기능, 동작)]	
	// 출력 기능
	public void showInfo() {
		System.out.println("번호 : " + bookNo);
		System.out.println("책 제목 : " + bookTitle);
		System.out.println("책 번호 : " + author);
		System.out.println("");
		
	}

}