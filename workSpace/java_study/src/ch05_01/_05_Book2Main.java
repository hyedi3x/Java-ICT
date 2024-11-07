package ch05_01;

// _05_Book2 클래스를 대입한다. Set 메서드 활용 
public class _05_Book2Main {
	public static void main(String[] args) {
  	// [class _05_Book2을 bk 변수에 대입]
		// [동작 구현 1] 객체 생성 
		_05_Book2 bk = new _05_Book2();
		
		/*
		    참조한 멤버변수가 private으로 선언되었기 때문에 set+멤버변수를 통해서 출력
 		 		데이터의 보안 및 안정성을 위해 private과 set 함수로 값을 대입받는게 좋다.
		 */
		// [동작 구현2] setter로 값 전달  
	  bk.setBookNo('1');                  // 책 번호 
	  bk.setBookTitle("나의 오렌지 나무");     // 책 이름
	  bk.setAuthor("조제 마우루 지 바스콘셀루스");  // 저자
	  bk.setPrice(25000);   // 책 가격
	  
	  // [동작 구현 7] 멤버 메서드(showInfo)를 불러옴  
		bk.showInfo(); 
		
		// [새로운 값 대입] 
		System.out.println("=== 다른 값 대입 ===");
		bk.setBookNo('2');                  // 책 번호 
	  bk.setBookTitle("어린왕자");           // 책 이름
	  bk.setAuthor("앙투안 드 생텍쥐페리");     // 저자
	  bk.setPrice(35000);   // 책 가격
	  
	  // 멤버 메서드(showInfo)를 불러옴  
		bk.showInfo(); 

	}

}

