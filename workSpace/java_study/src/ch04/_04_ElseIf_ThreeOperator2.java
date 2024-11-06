package ch04;

// 시험 결과 예제 (점수 범위 제한 - 논리합 사용) + 3항 연산자 (조건연산자 사용)
public class _04_ElseIf_ThreeOperator2 {
	public static void main(String[] args) {
		// score가 60점 이상이면 합격, 60점 미만이면 불합격(59~40), 40점 미만이면 과락 (39~0)
		 // int score = 110;
		 // int score = 55;
		 // int score = -10;
		  int score = 30;
		String result = "";
		
		System.out.println("=== 시험 점수 + 결과 출력===");
		/*
	   100초과, 0 미만(음수)
	   논리합(||) 사용 -> true || false -> true, true || true -> true
		*/
		if(score>100 || score<0) {   
			result = "잘못된 점수 입력";
		}
		
		// 0 이상 100 이하인 점수를 유효한 범위로 간주
		else {
			// 60점 이상일 때, 합격
			if (score >= 60) {
				result = "합격";
			}
			
			// 60점 미만 40점 이상일 때, 불합격
			else if (score >= 40) {
				result = "불합격";
			}

			// 40점 미만일 때, 과락
			else {
				result = "과락";
			}
		}
		
		System.out.println("당신의 점수는 " + score + "점이고, 결과는 " + result + "입니다.");
		System.out.println("");
		
		// 위에 작성한 if else문을 3항 조건식으로 표현. 
		System.out.println("=== 3항 연산자(조건 연산자) ===");
	  
		String result2 ="";
		result2 = (score>=0 && score<=100) ? ((score>=60) ? "합격" : ((score>=40) ? "불합격" : "과락")) : "잘못된 점수 입력";
		
		System.out.println(result2);
		
	}
	
}
