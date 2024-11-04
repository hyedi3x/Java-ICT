package ch03;

// 산술 연산자 (arithmetic operator)
public class _03_ArithmeticOperator {
	public static void main(String[] args) {
		// 산술 연산자를 사용하여 총점과 평점 구하기 
		System.out.println("== 산술 연산자를 사용하여 총점과 평점 구하기 ==");
		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = mathScore + engScore; // 총점 구하기
		System.out.println("totalScore : " + totalScore);
		
		double avgScore = totalScore / 2.0;  // 평균 구하기 
		System.out.println("avgScore : " + avgScore);
		
	}

}