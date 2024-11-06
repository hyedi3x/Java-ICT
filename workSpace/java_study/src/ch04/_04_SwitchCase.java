package ch04;

// switch-case문 예제 1
// 조건이 ‘하나의 변수값’이나 ‘하나의 상수값’으로 구분되는 경우 사용된다. (여러 조건이 필요한 경우 적합하지 않다.) 
public class _04_SwitchCase {

	public static void main(String[] args) {
		/*
    	switch(조건) {
        case 값1 : 수행문1;
          break;
        case 값2 : 수행문2;
          break; 
        ...           
        default: 수행문4;
      }
    */
		
    // [ranking에 따른 금메달 출력]
    // ranking 1:"금메달", 2:"은메달", 3:"동메달", 그외 "참가상" 
		int ranking = 3;
		String medal;
		
		switch (ranking) {
			case 1 : 
				medal="금메달";
				break;
			case 2 : 
				medal="은메달";
				break;
			case 3 : 
				medal="동메달";
				break;
			default : 
				medal = "참가상";			
		}
		
		System.out.println("[결과] \n순위 : " + ranking + "\n메달 : " + medal);

	}

}
