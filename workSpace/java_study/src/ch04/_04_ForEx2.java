package ch04;

// for문을 이용하여 1~10까지 합 구하기
public class _04_ForEx2 {
	public static void main(String[] args) {
    /*
       [1~10까지의 합]
       num=1, sum=1;
       num=2, sum=3
       num=3, sum=6
       ..
       num=10, sum=55
       1~10까지의 합 : 55 => 1번 출력
    */
		int sum = 0;
		
		// for(초기값; 조건식; 증감식)
		for(int num=1; num<=10; num++) {
			sum += num;
			System.out.println("num = " + num + ", sum = " + sum);
		}	
		System.out.println("");
		System.out.println("sum(1~10까지의 합) : " + sum);
	}
}
