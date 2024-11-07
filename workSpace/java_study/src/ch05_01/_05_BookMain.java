package ch05_01;

// _05_Book 클래스를 대입한다. 
public class _05_BookMain {
	public static void main(String[] args) {
		// 객체(인스턴스) 생성 
		/*
	     [객체 생성] 
	     클래스 변수명(참조 변수) = new 생성자(클래스);
	     변수명(참조변수).멤버변수; or 변수명(참조변수).멤버 메서드;
		 */
		
  	// [class _05_Book을 bk 변수에 대입]
		_05_Book bk = new _05_Book();
	  bk.bookNo = '1';      // 책 번호 
		bk.bookTitle = "Java 입문" ; // 책제목
		bk.author="박은종";    // 책저자
		
  	// class _05_Book에서 만든 멤버 메서드를 바로 불러와 출력(print문) 
		bk.showInfo(); 
		
		System.out.println("=== 다른 값 대입 ===");
		bk.bookNo = '2';
		bk.bookTitle = "JSP입문";
		bk.author = "최범균"; 

  	// class _05_Book에서 만든 멤버 메서드를 바로 불러와 출력(print문) 
		bk.showInfo(); 

	}

}
