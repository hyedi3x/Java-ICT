package ch04;

// 시험 결과 예제 (점수 범위 제한 - 논리합 사용)
public class _04_ElseIf_LimitScore {
	public static void main(String[] args) {
		// score가 60점 이상이면 합격, 60점 미만이면 불합격(59~40), 40점 미만이면 과락 (39~0)
		// int score = 110;  // score가 100을 넘어가게 대입
		// int score = 88;   // score 변수에 88을 대입
		// int score = -10;  // score 변수에 음수 -10을 대입
		int score = 20;      // score 변수에 20을 대입
		String result = "";
		
		System.out.println("=== 시험 점수 ===");
		/*
		   0 이상 100 이하인 점수를 유효한 범위로 간주, 
		   논리합(||) 사용 -> true || false -> true, true || true -> true
		 */
		if(score>100 || score<0) {  
			result = "잘못된 점수를 입력";
		}
		
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
		System.out.println("당신의 점수는 " + score + "점이고, 결과는 " + result + "하셨습니다.");
		System.out.println("");
	}
	
}