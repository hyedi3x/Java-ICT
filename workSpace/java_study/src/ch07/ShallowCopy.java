package ch07;

// [얕은 복사 : 복사한 인스턴스의 주소값 그대로 복사] 
public class ShallowCopy {
	public static void main(String[] args) {
		// [Book 클래스형으로 객체 생성] 
		Book[ ] bookArray1 = new Book[3];  
		Book[ ] bookArray2 = new Book[3];
			
		// [bookArray1 배열 요소 입력]
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");

		// [복사할 대상, 복사할 요소 위치, 복사 대상, 호출 위치, 복사 요소 수]
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
			
		// [bookArray2 배열 순대로 출력]
		System.out.println("=== 얕은 복사 (bookArray2) ===");
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
		System.out.println("=== 얕은 복사 (bookArray2) ===");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].printInfo();
		}
		
	}

}
