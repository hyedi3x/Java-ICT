package ch07;

// [향상된 for문 / for-each문]
// : 배열 요소값을 순서대로 하나씩 가져와서 변수에 대입후 실행 
public class EnhanceForArray {
	public static void main(String[] args) {
		System.out.println("=== 향상된 for 문 ===");
		String[] foodL = {"떡볶이", "우동", "김밥", "순대", "삼겹살"};
	
		// for(변수:배열){반복 실행문}
		for(String L : foodL) {
			System.out.println(L);
		}
	}
}
