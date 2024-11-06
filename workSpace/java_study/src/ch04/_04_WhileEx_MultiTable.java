package ch04;

// while문을 통한 구구단 예제
public class _04_WhileEx_MultiTable {

	public static void main(String[] args) {
		/* === 2단 ===
       2*1 = 2
       ...
       2*9 = 18
       ==========
    */
    System.out.println("*** 구구단 2단 출력 ***");

		int dan = 2;
		int i = 1;
		
		// dan에 곱해지는 i 값만 증가한다. 1~9까지 범위값 
		while (i <= 9) {
   		System.out.println(dan + "*" + i + "=" + (dan*i) + "입니다.");
			i++;
		}
		
		System.out.println("===============");
		System.out.println("");
		/*
       Test3. while문으로 구구단 작성
       2~9단까지 출력
       
       ****************
       *** 구구단 출력 ***
       ****************
       === 2단 ===
       2*1 = 2
       ...
       2*9 = 18
       === 9단 ===
       9*1 = 9
       ...
       9*9 = 81
    */
    
    System.out.println("*** 구구단 출력 ***");
    int dan2 = 2;
		int i2 = 1;
		
		// dan의 값이 1씩 증가를 반복한다. 2~9까지 범위값 
		while (dan2 <= 9) {
			System.out.println("");
			System.out.println("=====" + dan2 + "=====");
			
			// dan에 곱해지는 i 값만 증가한다. 1~9까지 범위값 
			while (i2 <= 9) {
	   		System.out.println(dan2+ "*" + i2 + "="+ (dan2*i2) + "입니다.");
	   		i2++;  // i값이 초기값으로 출력된 후, loop마다 1씩 증가 
			}
			
			dan2++;  // dan2의 값이 초기값으로 출력된 후, loop마다 1씩 증가
			i2=1;  // dan2가 1 업데이트될때마다, 곱해지는 i값을 1로 초기화하여 다시 시작한다.

		}

	}

}
