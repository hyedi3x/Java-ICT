package ch05;

// [Book 클래스를 대입한다.] 
public class BookMain {
	public static void main(String[] args) {
		// 객체(인스턴스) 생성 
  	// [Book 클래스를 bk 변수에 대입]
		Book bk = new Book();
	  bk.bookNo = '1';      // 책 번호 
		bk.bookTitle = "Java 입문" ; // 책제목
		bk.author="박은종";    // 책저자
		
  	// Book 클래스에서 만든 멤버 메서드를 바로 불러와 출력(print문) 
		bk.showInfo(); 
		
		System.out.println("=== 다른 값 대입 ===");
		bk.bookNo = '2';
		bk.bookTitle = "JSP입문";
		bk.author = "최범균"; 

  	// Book 클래스에서 만든 멤버 메서드를 바로 불러와 출력(print문) 
		bk.showInfo(); 
	}
	/*
    [객체 생성] 
    클래스 변수명(참조 변수) = new 생성자(클래스);
    변수명(참조변수).멤버변수; or 변수명(참조변수).멤버 메서드;
	*/
}


