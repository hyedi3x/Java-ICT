package ch04;

// switch-case문을 이용한 학점 구하기
public class _04_SwitchCase_GradeScore {
	public static void main(String[] args) {
		/*
		   1. 점수는 score 변수, 학점은 grade 변수
	     2. 점수가 90점 이상이면 A
	        점수가 80점 이상이면 B
	        점수가 70점 이상이면 C
	        점수가 60점 이상이면 D
	        점수가 60점 미만이면 F
	        범위를 벗어나면 X
	    
	     || : 논리합 : OR(또는) => 양쪽 모두 거짓일 때 거짓
	     && : 논리곱 : AND(이면서) => 양쪽 모두 참일때 참    
	   */
		
		int score = 33;
		// int score = 95;
	  // int score = 0;
		// int score = -22;
		char grade = ' ';
		
		System.out.println("=== 시험 점수 + 학점 점수 ===");
		
		/*
	   100초과, 0 미만(음수) -> X 출력
	   논리합(||) 사용 -> true || false -> true, true || true -> true
		*/
		if(score>100 || score<0) { 
			grade = 'X';
		}
		
		else {
			// 100 단위 수를 10으로 나눈 몫(/)으로 결과값을 출력한다. 
			switch (score/10) {  
			  // 100점인 경우, 'A'
				case 10 : 
					grade = 'A';
					break;
					
				// 99~90점인 경우, 'B'
				case 9 : 
					grade = 'B';
					break;

				// 89~80점인 경우, 'C'
				case 8 : 
					grade = 'C';
					break;

				// 79~70점인 경우, 'D'
				case 7 : 
					grade = 'D';
					break;
				// 69~0 'F'
				default : 
					grade = 'F';
			}
		
		}
		
		System.out.println("당신의 점수는 " + score + "점이고, 학점은 " + grade + "입니다.");
		System.out.println("");
	}

}
