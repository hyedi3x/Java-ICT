package ch04;

public class _04_ForEx {

	public static void main(String[] args) {
		/*
       `반복문 : 조건이 참인동안 반복(while문, for문)`
       
       for(초기값; 조건식; 증감식) {  // 반복횟수
           수행문1;
           수행문2;...
       } 
    */
    
    // 출력 => HappyDay1^^   HappyDay2^^  HappyDay3^^  HappyDay4^^  HappyDay5^^

		/* 
		   String day변수는 전역 변수이다. 
		   전역변수 : 전체 코드에 영향을 주는 변수이다.
		*/
		String day = "HappyDay";
		
		System.out.println("=== 증가 연산자 사용 ===");
		/* 
		   for 문 안의 count 변수는 지역변수이다.
		   지역변수는 함수나 클래스 안에서 선언되어, 각 함수나 클래스 별로 변수명이 겹쳐도 괜찮다.
		*/
		// count값이 1로 시작하여 5로 끝남 
		for (int count = 1; count <= 5; count++) {
			System.out.println(day + count + "^^");
		}
		System.out.println("");
		
		// count값이 5로 시작하여 1로 끝남 
		System.out.println("=== 감소 연산자 사용 ===");
		for (int count = 5; count > 0; count--) {
			System.out.println(day + count + "^^");
		}
		
	}
	
}