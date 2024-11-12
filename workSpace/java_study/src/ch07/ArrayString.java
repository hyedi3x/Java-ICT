package ch07;

// {문자열 배열} 
public class ArrayString {
	public static void main(String[] args) {
		// {선언과 생성을 동시에}
		String[] drink = new String[5];
		// [각 배열 요소에 인스턴스 생성]
		drink[0] = "아이스 아메리카노";
		drink[1] = "바닐라 라떼";
		drink[2] = "돌체 라떼";
		drink[3] = "아샷추";
		drink[4] = "요거트 스무디";
		
		System.out.println("=== 배열 선언과 생성 동시에 ===");
		// [배열 순서대로, 배열의 길이 만큼 반복 출력]
		for(int i=0; i<drink.length; i++) { // i = 인덱스 값과 같다. 
			System.out.println("drink[" + i + "]" + " : " + drink[i]);
		}
		System.out.println("");
		
		// -------------
		// [선언과 할당을 동시에 한다]
		String[] food = new String[]{"떡볶이", "우동", "김밥", "순대", "삼겹살"};					

		System.out.println("=== 배열 선언과 할당 동시에 ===");
		// [배열 순서대로, 배열의 길이 만큼 반복 출력]
		for(int i=0; i<food.length; i++) {
			System.out.println("food[" + i + "]" + " : " + food[i]);
		}
		System.out.println("");
	}

}
