package ch07;

// [책 저자와 책이름을 담고 있는 클래스] 
public class Book {
	// [멤버 변수]
	private String bookName;   // 책 이름
	private String author;     // 책 저자
	
	// [디폴트 생성자] 
	public Book() {
		
	}
	
	// [매개변수 생성자]
	public Book(String name, String author) {
		bookName = name;
		this.author = author;
	}
	
	// [get, set 메서드]
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String name) {
		this.bookName = name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

	// [출력 메서드]
	public void printInfo() {
		System.out.println("책 이름 : " + bookName + ", 저자 : " + author);
	}
}
