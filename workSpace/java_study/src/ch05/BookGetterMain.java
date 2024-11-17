package ch05;

// [BookGetter 클래스를 대입한다. get 메서드 활용] 
public class BookGetterMain {
	public static void main(String[] args) {
		// [동작 구현 1] 객체 생성 
		BookGetter bk = new BookGetter();
		
		/*
		    참조한 멤버변수가 private으로 선언되었기 때문에 set+멤버변수를 통해서 출력
 		 		데이터의 보안 및 안정성을 위해 private과 set 함수로 값을 대입받는게 좋다.
		 */
		// [동작 구현2] setter로 값 전달  (입력)
	  bk.setBookNo('1');                  // 책 번호 
	  bk.setBookTitle("나의 오렌지 나무");     // 책 이름
	  bk.setAuthor("조제 마우루 지 바스콘셀루스");  // 저자
	  bk.setPrice(25000);   // 책 가격
	  
	  // getter로 값 출력
	  bk.getBookNo();
	  bk.getBookTitle(); // 책 이름
	  bk.getAuthor();    // 저자
	  bk.getPrice();  
	  
	  // [동작 구현 7] 멤버 메서드(showInfo)를 불러옴  
		bk.showInfo(); 
			
		bk.getterInfo();

	}
}
