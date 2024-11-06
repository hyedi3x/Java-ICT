package ch04;

// break 문을 사용해 sum 값이 100이 되면 stop 
public class _04_BreakEx {

	public static void main(String[] args) {
		/*
       [ break문 ]
       - 반복문이 중첩되어 있을 경우 break문은 가장 가까운 반복문만 종료한다.
       - 반복문안에서 continue문을 만나면, 아래의 문장은 수행하지 않되 계속 수행하며,
         break문을 만나면 반복문을 더 이상 수행하지 않고 빠져나올때 사용한다.
    */
    
    // 1~100까지 더하다가, sum이 100 이상이면 빠져나온다.
		int sum = 0;
		int num;
		
		// num 초기값을 0으로 하고 100까지 증가하게 반복한다. 
		for(num=0; num<=100; num++) {
			sum += num;    // sum = sum+num;
			
			if(sum >= 100) // break 조건  
				break;       // sum>=100이 되는 순간 반복문 중단
		}
		
		System.out.println("sum이 100보다 크면 종료 : (가장 마지막 수)" + sum + "입니다.");
		System.out.println(num+"까지 입력되고 break");
		
	}

}