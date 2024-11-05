package ch04;

// 시험 결과 예제 1
public class _04_ElseIF_ExamScore {
	
  public static void main(String[] args) {
    // score가 60점 이상이면 합격, 60점 미만이면 불합격(59~40), 40점 미만이면 과락 (39~0)
    // int score = 70;      // score 값 70으로 대입
    int score = 40;
    String result = "";  // String result 변수 선언 
	
    // 60점 초과일 때, 합격	
    if (score >= 60) { 
      result = "합격";
    }
		
    // 60점미만 40점 이상일 때, 불합격
    else if (score >= 40) {
      result = "불합격";
    }

    // 40점 미만일 때, 과락
    else {
      result = "과락";
    }

    System.out.println("당신의 점수는 " + score + "점이고, 결과는 " + result + "입니다.");		
  }
  
}
