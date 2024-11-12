package ch07;

//[객체 배열 인스턴스 5개 메모리 할당, 값 대입o]
public class BookMain2 {
	public static void main(String[] args) {
		// [Book 클래스형으로 객체 생성] 
		Book[] library = new Book[5];   // 배열(인스턴스) 5개 메모리 할당
		
		// [인스턴스에 요소값 대입]
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생텍쥐페리");
		
		// [인덱스 i : 1씩 증가, library 요소 : 순서대로 출력(5번 반복)]
		for(int i=0; i<library.length; i++) {
			library[i].printInfo();
		}
		
		// [배열 요소에 값을 할당하여 주소값이 담김]
		System.out.println("");
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
	}
}
