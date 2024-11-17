package ch05;

// [Set, Get 메서드 활용] 
public class BookGetter {
	
	//------[멤버변수(속성)]---------
	// [동작 구현 5] 멤버변수로 값을 전달 받는다. 
	// private : 클래스 내부에서만 값을 입력받는다. 
  private char bookNo;      // 책 번호 
	private String bookTitle; // 책제목
	private String author;    // 책저자 
	private int price;        // 가격
	
	// ------[멤버 메서드(기능, 동작)]---------
	/*
	   [setter] 기능 : 값을 지정하는 메서드 
	   set+멤버변수명[첫글자를 대문자로 변경] : set 메서드 생성 
	   (자료형 멤버변수명) : Main 함수 속 참조변수.멤버변수 값이 들어옴 
	*/

	// [private 멤버변수에 BookGetterMain 클래스에 받아온 데이터를 대입하는 메서드] 
	// [동작 구현 3] 매개변수 char bookNo 값 지정  
	public void setBookNo(char bookNo) {
		// this.bookNo : 참조변수.멤버변수 | bookNo : char bookN0
		this.bookNo = bookNo;  // [동작 구현 4]
	}
	
	// [bookNo 값을 불러오는 getter 함수 생성]
	public int getBookNo() {
		return bookNo;
	}
	
	// [동작 구현 3] 매개변수 String bookTitle 값 지정   
	public void setBookTitle(String bookTitle) {
		// this.bookTitle : 참조변수.멤버변수 | bookTitle : String bookTitle
		this.bookTitle = bookTitle;   // [동작 구현 4]
	}
	
	// [bookTitle 값을 불러오는 getter 함수 생성]
	public String getBookTitle() {
		return bookTitle;
	}
	
	// [동작 구현 3] 매개변수 String author 값 지정    
	public void setAuthor(String author) {
		// this.author : 참조변수.멤버변수 | author : String author
		this.author = author;   // [동작 구현 4]
	}
	
	// [author 값을 불러오는 getter 함수 생성]
	public String getAuthor() {
		return author;
	}
	
	// [동작 구현 3] 매개변수 int price 값 지정  
	public void setPrice(int price) {
		// this.price : 참조변수.멤버변수 | price : int price
		this.price = price;   // [동작 구현 4]
	}
	
	// [price 값을 불러오는 getter 함수 생성]
	public int getPrice() {
		return price;
	}
	
	// -----[출력 기능, 내부 메서드]-------
	// [동작 구현 6] 멤버 변수에 대입된 값을 직접출력 
	public void showInfo() {
		System.out.println("번호 : " + bookNo);
		System.out.println("책 제목 : " + bookTitle);
		System.out.println("책 번호 : " + author);
		System.out.println("책 가격 : " + price);
		System.out.println("");
		
	}
	
	// [멤버변수 값을 불러와서 출력메서드] 
	public void getterInfo() {
		System.out.println("번호 : "+bookNo);
		System.out.println("책 제목 : " + bookTitle);
		System.out.println("책 번호 : " + author);
		System.out.println("책 가격 : " +price);
		System.out.println("");
		
	}

}
