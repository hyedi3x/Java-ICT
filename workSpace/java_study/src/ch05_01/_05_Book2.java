package ch05_01;

// Set 메서드 활용 
public class _05_Book2 {
	
	// [멤버변수(속성)] 
	// [동작 구현 5] 멤버변수로 값을 전달 받는다. 
	// private : _05_Book2 클래스 내부에서만 값을 입력받는다. 
  private char bookNo;      // 책 번호 
	private String bookTitle; // 책제목
	private String author;    // 책저자 
	private int price;        // 가격
	
	// -----------------------------------
	// [멤버 메서드(기능, 동작)]
	/*
	   [setter] 기능
	   set+멤버변수명[첫글자를 대문자로 변경] : set 메서드 생성 
	   (자료형 멤버변수명) : Main 함수 속 참조변수.멤버변수 값이 들어옴 
	 */

	// [private 멤버변수에 _05_BookMain 클래스에 받아온 데이터를 대입하는 메서드] 
	// [동작 구현 3] 매개변수 char bookNo로 값을 전달 받는다.  
	public void setBookNo(char bookNo) {
		// this.bookNo : 참조변수.멤버변수 | bookNo : char bookN0
		this.bookNo = bookNo;  // [동작 구현 4]
	}
	
	// [동작 구현 3] 매개변수 String bookTitle로 값을 전달 받는다.  
	public void setBookTitle(String bookTitle) {
		// this.bookTitle : 참조변수.멤버변수 | bookTitle : String bookTitle
		this.bookTitle = bookTitle;   // [동작 구현 4]
	}
	
	// [동작 구현 3] 매개변수 String autor로 값을 전달 받는다.  
	public void setAuthor(String author) {
		// this.author : 참조변수.멤버변수 | author : String author
		this.author = author;   // [동작 구현 4]
	}
	
	// [동작 구현 3] 매개변수 int price로 값을 전달 받는다.  
	public void setPrice(int price) {
		// this.price : 참조변수.멤버변수 | price : int price
		this.price = price;   // [동작 구현 4]
	}
	
	// -----------------------------------
	// [출력 기능, 내부 메서드]
	// [동작 구현 6] 멤버 변수에 대입된 값을 출력 
	public void showInfo() {
		System.out.println("번호 : " + bookNo);
		System.out.println("책 제목 : " + bookTitle);
		System.out.println("책 번호 : " + author);
		System.out.println("책 가격 : " + price);
		System.out.println("");
		
	}

}

