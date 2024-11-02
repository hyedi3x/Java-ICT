package ch02;

//문자형(CharacterType) 자료형 실습 
public class _02_CharacterType {
	public static void main(String[] args) {
		// [문자형 타입(2byte)] 
		// 자바는 유니코드 기반의 문자를 표현하기 때문 
		System.out.println("=====문자형 변수=====");
	
		// [char type 선언 및 문자 'A' 값 대입]
		char myChar = 'A';
		System.out.println("myChar : " + myChar);		// 문자 출력
		System.out.println("");	
		
		// [char type -> int type으로 형 변환]
		// 문자에 해당하는 정수 값(아스키 코드값) 출력, `인코딩` 
		System.out.println("=== char type -> int type으로 형 변환 ===");
		System.out.println("myChar의 아스키코드 : " + (int)myChar);  
		System.out.println("");	
	
		// [char type 선언 및 아스키 코드값 66 대입]
		System.out.println("=== 아스키 코드값 문자로 변환후 출력(디코딩) ===");
		char ch2 = 66;   // 정수 값 대입 
		
		// 정수 값 66에 해당하는 문자를 자동으로 출력한다, 디코딩
		System.out.println("정수값을 char type으로 변환 : " + ch2);    
		System.out.println("");	
	
		// [int type -> char type으로 형 변환]
		System.out.println("=== int type -> char type으로 형 변환 ===");
		int ch3 = 67;  // 정수형 타입
		System.out.println("ch3 값 출력(int type) : " +ch3);   // 정수 값 출력
		
		// 정수형 변수를 문자형으로 변환 후 출력
		System.out.println("ch3을 char type으로 변환 : " + (char)ch3);
		System.out.println("");	
	}
}
