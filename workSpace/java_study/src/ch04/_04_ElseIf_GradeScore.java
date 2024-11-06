package ch04;

// else if문을 이용한 학점 구하기
public class _04_ElseIf_GradeScore {
	
	public static void main(String[] args) {
		/*
		  1. 점수는 score 변수, 학점은 grade 변수
	    2. 점수가 90점 이상이면 A
	       점수가 80점 이상이면 B
	       점수가 70점 이상이면 C
	       점수가 60점 이상이면 D
	       점수가 60점 미만이면 F
	        범위를 벗어나면 Ｘ
	   
	    || : 논리합 : OR(또는) => 양쪽 모두 거짓일 때 거짓
	    && : 논리곱 : AND(이면서) => 양쪽 모두 참일때 참
	  */
		// int score = 60;  // score가 60을 넘어가게 대입
		// int score = 102;   // score 변수에 102을 대입
		// int score = 79;    // score 변수에 79을 대입
		 int score = 55;    // score 변수에 55을 대입	
		char grade = ' ';
		
		System.out.println("=== 시험 점수 + 학점 점수 ===");
		
		/*
	   100초과, 0 미만(음수)
	   논리합(||) 사용 -> true || false -> true, true || true -> true
		*/
		if(score>100 || score<0) {  
			grade = 'Ｘ';
		}
		
   	// 0 이상 100 이하인 점수를 유효한 범위로 간주
		else {
			// 점수가 90점 이상이면 A
			if (score >= 90) {
				grade = 'A';
			}
			
			// 점수가 80점 이상이면 B
			else if (score >= 80) {
				grade = 'B';
			}
			
			// 점수가 70점 이상이면 C
			else if (score >= 70) {
				grade = 'C';
			}
			
			// 점수가 60점 이상이면 D
			else if (score >= 60) {
				grade = 'D';
			}

			// 점수가 60점 미만이면 F
			else {
				grade = 'F';
			}
			
		}
		
		System.out.println("당신의 점수는 " + score + "점이고, 학점은 " + grade + "입니다.");
		System.out.println("");
		
	}

}