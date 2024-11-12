package ch07;

// [깊은 복사 : 인스턴스 생성 후, 배열 복사] 
public class DeepCopy {
	public static void main(String[] args) {
		// [Book 클래스형으로 객체 생성] 
		Book[ ] bookArray1 = new Book[3];  
		Book[ ] bookArray2 = new Book[3];
			
		// [bookArray1 배열 요소 입력]
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		
		// [bookArray2 배열 인스턴스 생성 - 디폴트 생성자]
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
			
		// booArray1 배열 요소를 bookArray2 배열 인스턴스에 복사]
		for(int i=0; i<bookArray1.length; i++) {
			// bookArray1 책 이름을 bookArray2에 대입
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			// bookArray1 책 저자를 bookArray2에 대입
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		// [bookArray2 배열 순대로 출력]
		System.out.println("=== bookArray2 ===");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].printInfo();
		}
		System.out.println("");
		
		// ----------------- 
		// [bookArray1 배열의 첫 번째 요소 값 변경]
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		// [요소 수정된 bookArray1 값 출력]
		System.out.println("=== 요소 수정 (bookArray1) ===");
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].printInfo();
		}
		System.out.println("");
		
		// [복사한 bookArray2 값 출력]
		// bookArray1의 수정된 값이 적용 안됨(깊은 복사)
		System.out.println("=== 깊은 복사 (bookArray2) ===");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].printInfo();
		}
		
	}

}
