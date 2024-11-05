package ch04;

// 나이에 따른 놀이공원 입장료 계산하기 
public class _04_ElseIf_EntranceFee {

	public static void main(String[] args) {
		System.out.println("== 나이에 따른 놀이공원 입장료 계산하기 ==");
		// int age = 9;    // 나이를 9세로 지정
		int age = 20;      // 나이를 20세로 지정
		int charge;        // 정수형 변수 charge 선언
		String result;     // 문자열형 변수 result 선언
		
		// 8세 미만이라면
		if (age < 8) {
			charge = 1000;
			result = "미취학 아동입니다.";
		}
		
		// 14세 미만이라면
		else if (age < 14) {
			charge = 2000;
			result = "초등학생입니다.";
		}
		
		// 20세 미만이라면 
		else if (age < 20) {
			charge = 2500;
			result = "중, 고등학생입니다.";
		}
		
		// 그 외의 나이
		else {
			charge = 3000;
			result = "성인입니다.";
		}
		
		System.out.println(result);
		System.out.println("입장료는 " + charge + "원입니다.");
		
	}

}