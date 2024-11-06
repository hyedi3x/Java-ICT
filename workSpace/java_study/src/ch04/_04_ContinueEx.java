package ch04;

// 1~100까지 수를 더할 때, 짝수의 값만 더하는 프로그램 
public class _04_ContinueEx {

	public static void main(String[] args) {
		/*
      [ continue문 ]
      continue문은 반복문과 함께 사용한다.
      반복문안에서 continue문을 만나면, 그 이후의 문장은 수행하지 않고,
      for문으로 돌아가 증감식을 수행한다.
    */
    
		// 1~100까지의 짝수 합계
		int total = 0;
		int num;
		
		for(num=1; num<=100; num++) {  // 100까지 반복 
			if(num%2==1)     // num값이 홀수인 경우, 2로 나누었을 때 나머지가 1이라서 
				continue;      // 홀수 일때는 total += num 수행을 생략하고 num++ 수행
			total += num;    // num 값이 짝수인 경우에만 수행 
		}
		System.out.println("1부터 100까지의 짝수의 합은 " + total + "입니다.");
	}

}

