package ch03;

// 대입 연산자(assignment operator)
public class _03_AssignmentOperator {
	public static void main(String[] args) {
		// 대입 연산자 : 변수에 값을 대입하는 연산자
		int age = 24; // age 변수에 값 24를 대입 
		
		/*
		 * 대입 연산 시, 이항 연산자의 연산이 우선 수행된 후, 
		 * 결과값이 변수에 대입된다. 
		 * 1. mathScore 값과 engScore 값이 더해짐
		 * 2. 총점을 의미하는 totalScore 변수에 대입함 
		 */
		int mathScore = 100;
		int engScore = 70;
		int totalScore = mathScore + engScore;
		
		System.out.println("=== 대입연산자 ===");
		System.out.println("mathScore : " + mathScore);
		System.out.println("engScore : " + engScore);
		System.out.println("totalScore : " + totalScore);
		System.out.println("");
		
		// [부호 연산자] 
		/*
		 * 부호 연산자는 +, - 두 가지가 있다. 부호 연산자는 ‘단항 연산자’로고도 불린다. 
		 * 값을 음수와 양수로 구분하려면 = 연산자(대입 연산자)를 사용하여 값을 꼭 대입시켜줘야 한다. 
		 */
		int num = 10; 
		
		System.out.println("=== 부호 연산자 ===");
		System.out.println("+num : " + +num);  // 값이 10 그대로 출력 
		System.out.println("-num : " + -num);  // -10이 출력되긴 하지만, num값이 변경된 것은 아니다. 
		System.out.println("num : " + num);   // 값이 10 그대로 출력 
		System.out.println("");
		
		num = -num;    // num값을 음수로 바꾼 후, 다시 num에 대입 
		System.out.println("num : " + num);   // 값이 -10으로 출력 
		
		
		
	}

}

