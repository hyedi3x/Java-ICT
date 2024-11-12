package ch07;

// [객체 배열 인스턴스 5개 메모리 할당, 값 대입x]
public class BookMain {
	public static void main(String[] args) {
		// [Book 클래스형으로 객체 생성] 
		Book[] library = new Book[5];   // 배열(인스턴스) 5개 메모리 할당
		
		// [배열 요소에 값을 대입하지 않아, null값이 담김]
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
	}
}
