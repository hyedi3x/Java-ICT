package ch04;

//do-while 문은 {} 안의 문장을 무조건 한번 수행한 후에, 조건식을 검사한다. 
public class _04_DoWhile {

	public static void main(String[] args) {
		/*
       [ do-while ]
       {} 안의 문장을 무조건 한번 수행한 후에 조건식이 참이면 반복, 거짓이면 빠져나간다.
       
       do {
           수행문1;
           ...
       } while(조건식);    
       수행문2;
    */
    // [1~10까지 출력] 
    System.out.println("=== 1~10까지 출력 ===");
    int i = 1;
    
    do {
    	System.out.println("i : " + i );  //i의 현재 값을 출력
			i++;	// i값을 1씩 증가 	 
		} while (i <= 10);    // i가 10이하일 동안 반복
		
    
		System.out.println("");

  	// [1~10까지 합계 출력] 
    System.out.println("=== 1~10까지 합계 출력 ===");
    int j = 1;
    int sum1 = 0;
		
		do {
			sum1 += j;  // sum1 = sum1 + j;
			j++;		// j값을 1씩 증가 	 
		} while (j <= 10);  // j가 10이하일 동안 반복 
		
		System.out.println("1부터 10까지의 합은 " + sum1 +"입니다");
		System.out.println("");

  	// [1~10까지 합계 과정 출력] 
    System.out.println("=== 1~10까지 합계 과정 출력 ===");
    /* 
       1 + 0 = 1
    	 2 + 1 = 3
    	 ...
     	 10 + 45 = 55
     	 
     	 - 반복문 종료 
    */ 
    int k = 1;
    int sum2 = 0;
    
    
    do {    	
    	System.out.print(k + " + " + sum2 + " = ");
      sum2 += k;    // sum2 = sum2+k;
      System.out.println(sum2);  // 현재 누적합 출력
      k++;	// k값을 1씩 증가 	 
      
		} while (k <= 10);   // k가 10이하일 동안 반복 
    
		System.out.println("");

	}
	
}

