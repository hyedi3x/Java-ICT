package ch07;

// [정수형 배열] 
public class ArrayScore {
	public static void main(String[] args) {
		 // [선언과 생성을 동시에]
		int[] scores = new int[5];
		// [각 배열 요소에 인스턴스 생성]
		scores[0] = 10;
		scores[1] = 20;
		scores[2] = 30;
		scores[3] = 40;
		scores[4] = 50;
		
		System.out.println("=== 배열 선언과 생성 동시에 ===");
		// [배열 순서대로, 배열의 길이 만큼 반복 출력]
		for(int i=0; i<scores.length; i++) {   // i = 인덱스 값과 같다. 
			System.out.println("scores[" + i + "]" + "=" + scores[i]);
		}
		System.out.println("");
		
		// -------------
		// [선언과 할당을 동시에 한다]
		int[] scores2 = new int[]{60, 70, 80, 90, 100};					

		System.out.println("=== 배열 선언과 할당 동시에 ===");
		// [배열 순서대로, 배열의 길이 만큼 반복 출력]
		for(int i=0; i<scores2.length; i++) {
			System.out.println("scores2[" + i + "]" + "=" + scores2[i]);
		}
		System.out.println("");
	}
	/*
  	배열(Array) : 대량의 `동일한 자료형`의 데이터를 한꺼번에 저장할 수 있는 저장 장소이다.
  	방법1) 선언과 생성을 따로 한다.
        	int[] scores;  // 선언
        	scores = new int[갯수];  // 생성
        	scores[index] = 값;
   
  	방법2) 선언과 생성을 동시에 한다. .. 추천
        	int[] scores = new int[갯수];
        	scores[index] = 값;
       
  	방법3) int[] scores = new int[] {값1, 값2,...}   // 개수 생략.. 추천
   
  	방법4) 선언과 할당을 동시에 한다. .. 제일 많이 사용
        	int[] scores = {값1, 값2,...};      
	 */
}
