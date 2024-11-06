package ch04;

// 이전에 작성한 if else 문을 3항 연산자(조건 연산자)으로 표현해본다.
public class _04_ElseIf_ThreeOperator {
	public static void main(String[] args) {
		System.out.println("8살이상이면 \"학교에 다닙니다\"를 출력, 그렇지 않을 경우 \"학교에 다니지 않습니다.\" 출력, \"종료\" 출력");
		int age = 9;   // 나이를 9세로 지정  
		
		// 나이가 8세 이상이라면, if 문 출력
		if(age >= 8) {
			System.out.println("if : 학교에 다닙니다.");
		}
		
		// 8세 미만이라면, else문 출력 
		else {
			System.out.println("else : 학교에 다니지 않습니다.");
		}
		System.out.println("출력 : 종료");
		System.out.println("");
		
	  // 위에 작성한 if else문을 3항 조건연산자로 표현. 
		// 조건 연산자 형식 | 결과 = 조건식 ? 참 : 거짓;
		System.out.println("==== 3항 연산자(조건 연산자) ====");

	  String result = "";
	  
	  result = (age >= 8) ? "학교에 다닙니다." : "학교에 다니지 않습니다.";
		System.out.println(result);
		
	}

}

