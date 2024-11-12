package ch07;

// [배열 초기화하고 출력하기] 
public class ArraySequence {
	public static void main(String[] args) {
		// [1. 배열의 초기화 요소의 개수를 생략하고, 요소 입력]
		System.out.println("=== 1. ===");
		int[ ] num = new int[ ]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};   // 개수 생략 
		
		// num[0]~num[9]까지 순서대로 출력
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]);  // i 배열 출력
		}
		
		// ------------------------
		// [2. 선언과 동시에 초기화, new 생략]
		System.out.println("");
		System.out.println("=== 2. ===");
		 // int 형 요소가 10개인 배열 생성, new 생략
		int[ ] num2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  
			
		// num[0]~num[9]까지 순서대로 출력
		for(int i=0; i<num2.length; i++) {
			System.out.print(num2[i]);  // i 배열 출력
		}

		// ------------------------
		// [3. 배열 자료형 선언 후, 초기화, new 생략 불가]
		System.out.println("");
		System.out.println("=== 3. ===");
		// int 형 요소가 10개인 배열 생성, new 생략 불가
		int[ ] num3;
		num3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  
				
		// num[0]~num[9]까지 순서대로 출력
		for(int i=0; i<num3.length; i++) {
			System.out.print(num3[i]);  // i 배열 출력
		}

		// ------------------------
		// [4. 배열 자료형 선언 후, 각 배열 요소에 인스턴스 생성 ]
		System.out.println("");
		System.out.println("=== 4. ===");
		int[ ] num4 = new int[10];
		num4[0] = 1;
		num4[1] = 2;
		num4[2] = 3;
		num4[3] = 4;
		num4[4] = 5;
		num4[5] = 6;
		num4[6] = 7;
		num4[7] = 8;
		num4[8] = 9;
		num4[9] = 10;
		
		// num[0]~num[9]까지 순서대로 출력
		for(int i=0; i<num4.length; i++) {
			System.out.print(num4[i]);  // i 배열 출력
		}
	}
}
