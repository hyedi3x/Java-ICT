package ch07;

//[System.arraycopy( )로 클래스형 객체 배열 복사하기]
public class BookCopy {
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
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].printInfo();
		}
	}
}
