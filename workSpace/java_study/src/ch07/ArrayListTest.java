package ch07;

import java.util.ArrayList;   // ArrayList 클래스 import 

// [Book 클래스를 참조 자료형으로 쓰는 ArrayList]
public class ArrayListTest {
	public static void main(String[] args) {
		// [ArrayList 선언]
		ArrayList<Book> library = new ArrayList<Book>();
		
		// [add() 메서드를 사용해 생성자 호출]
		library.add(new Book("태백산맥", "조정래"));
		library.add(new Book("데미안", "헤르만 헤세"));
		library.add(new Book("어떻게 살 것인가", "유시민"));
		library.add(new Book("토지", "박경리"));
		library.add(new Book("어린왕자", "생텍쥐페리"));
		
		// [size() 메서드 : 배열에 추가된 요소 개수만큼만 출력]
		for (int i=0; i<library.size(); i++) {
			Book book = library.get(i);
			book.printInfo();
		}
		System.out.println();
		
		System.out.println("=== 향상된 for문 사용 ===");
		for(Book book : library) {
			book.printInfo();
		}

	}

}
