package ch04;

// while문 (1~10 합계 출력)
public class _04_WhileEX {

	public static void main(String[] args) {
		/*
		   반복문 : 조건이 참인 동안 계속해서 반복수행(while문, for문)
       1.초기값 -> 2.조건식 -> 3.증감식
     */

    // [1~10까지 출력] 
		System.out.println("=== 1~10까지 출력 ===");
		int i = 1;
		
		while(i <= 10) { 
			System.out.println("i : " + i );
			i++;
		}
		System.out.println("");

		
		// [1~10 합계 출력] 
		System.out.println("=== 1~10 합계 출력 ===");
		int j = 1;
		int sum1 = 0;
		
		while(j <= 10) { 
			sum1 += j;
			j++;
		}
		System.out.println("1부터 10까지의 합은 : " + sum1 + "입니다.");
		System.out.println("");
		
		// [1~10 합계 과정 출력] 
		System.out.println("=== 1~10까지 합계 과정 출력 ===");
		/* 
		  1+0=1
		  2+1=3
		  ... 
		  10+45=55
		  --반복문 종료--   
		*/
		int k = 1;
		int sum2 = 0;    // k 값을 누적해서 더할 변수 
		
		while(k <= 10) { 

			System.out.print(k + " + " + sum2 + " = ");
			sum2 += k;    // sum2 = sum2 + k
			System.out.println(sum2);
			k++;
			
			// System.out.println((k-1) + "+" + (sum2-(k-1)) + "=" + sum2 + "입니다.");

		}
		
		System.out.println("");

	}

}