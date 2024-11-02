package ch02;

// 자료형 추론 (자료형 기재x)
public class _02_TypeInference {
	public static void main(String[] args) {
		var i = 10;     // 정수형 기본형인 int형으로 자동 컴파일
		var j = 10.0;   // 실수형 기본인 double 형으로 자동 컴파일
		var str = "hello"; // 문자열 기본인 String 클래스로 자동 컴파일
	
		System.out.println("정수형으로 출력 : " + i);		
		System.out.println("실수형으로 출력 : " + j);
		System.out.println("String 클래스로 출력 : " + str);
	
		// str = "test"; /* 다른 문자열로는 대입 가능하다. */ 
		// str = 3; /*str 변수가 String 형으로 선언되었기 때문에 정수 값으로 재선언이 불가능하다.*/ 
	}
}