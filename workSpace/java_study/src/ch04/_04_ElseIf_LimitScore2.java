package ch04;

//시험 결과 예제 (점수 범위 제한 - 논리곱 사용)
public class _04_ElseIf_LimitScore2 {
	
	public static void main(String[] args) {
		// score가 60점 이상이면 합격, 60점 미만이면 불합격(59~40), 40점 미만이면 과락 (39~0)
		 int score = 160;  // score가 160을 넘어가게 대입
		// int score = 72;   // score 변수에 72을 대입
		// int score = -6;  // score 변수에 음수 -6을 대입
		// int score = 30;      // score 변수에 30을 대입	
		String result = "";
			
		System.out.println("=== 시험 점수 ===");
		/*
	     0 이상 100 이하인 점수를 유효한 범위로 간주, 
	     논리곱(&&) 사용 -> true && false -> false, true && true -> true
		 */
		if(score>=0 && score<=100) { 
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
			
		// 100초과, 0 미만(음수)
		else {
			result = "잘못된 점수를 입력";
		}
		System.out.println("당신의 점수는 " + score + "점이고, " + result + "하셨습니다.");
		System.out.println("");
	}
	
}