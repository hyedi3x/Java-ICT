package ch04;

// for문을 이용해 콘솔에 구구단 출력
public class _04_ForEx_MultiTable {
	public static void main(String[] args) {

		// [2단 출력] 
    System.out.println("*** 구구단 2단 출력 ***");
		int dan = 2;
		
		// for (초기값; 조건식; 증감식) 
		for (int i=1; i <= 9; i++) {   // i = 1~9, 1씩 증가  
			System.out.println(dan + "*" + i + "=" + (dan*i) + "입니다.");
		}	
		
		System.out.println("===============");
		System.out.println("");
		
		//[2~9단 출력] 
		System.out.println("*** 구구단 2~9단 출력 ***");
		int dan9;
		int i;
		int sum;
		
		// 중첩 반복문 (2~9단까지 반복하는 외부 반복문) 
		for (dan9=2; dan9<=9; dan9++) {
			System.out.println("===" + dan9 + "단===");
			
			// 각 단에서 1~9를 곱하는 내부 반복문 
			for (i=1; i<=9; i++) { 
				sum=dan9*i;
				System.out.println(dan9 + "*" + i + "=" + sum + "입니다.");
			}
			System.out.println("");
		}	
		
	}
	
}
