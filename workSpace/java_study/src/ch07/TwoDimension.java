package ch07;

// [2차원 배열] 
public class TwoDimension {
	public static void main(String[] args) {
		// [정수형 배열 출력]
		System.out.println("=== 정수형 배열 출력 ===");
		int[][] arr = {{1,2,3},    // 0행 [0열, 1열, 2열]
									 {4,5,6}};   // 1행 [0열, 1열, 2열]
		for(int i=0; i<arr.length; i++) {       // 행 : 배열.length
			for(int j=0; j<arr[i].length; j++) {  // 열 : 행.length
				System.out.print(arr[i][j]);  // [0][0], [0][1],,,
			} System.out.println("");
		}
		
		// [하드 코딩]
		System.out.println("=== 하드코딩 ===");
		for(int i=0; i<2; i++) {       // 행 : 배열.length
			for(int j=0; j<3; j++) {  // 열 : 행.length
				System.out.print(arr[i][j]);  // [0][0], [0][1],,,
			} System.out.println("");
		}
		
		// [문자열 배열 출력]
		System.out.println("=== 문자열 배열 출력 ===");
		String[][] str = {{"A","B","C"},    // 0행 [0열, 1열, 2열]
				 							{"D","E","F"},    // 1행 [0열, 1열, 2열]
											{"G","H","I"}};   // 2행 [0열, 1열, 2열]
		for(int i=0; i<str.length; i++) {       // 행 : 배열.length
			for(int j=0; j<str[i].length; j++) {  // 열 : 행.length
				System.out.print(str[i][j]);  // [0][0], [0][1],,,
			} System.out.println("");
		}
		
		// [문자열 배열 출력 - 향상된 for문 사용] 
		System.out.println("=== 문자열 배열 출력 (향상된 for문 사용) ===");
		for(String[] arrayStr : str) {     // String 타입의 배열을 먼저 불러온 후 
			for(String pstr : arrayStr) {    // String 타입 요소 반복 출력
				System.out.print(pstr);
			} System.out.println("");
		}
	}
}
