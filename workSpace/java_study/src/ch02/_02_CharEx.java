package ch02;

// 문자형 자료형 예제
//[ch1 = 'Z', ch2 = 38, ch3=97로 대입해봐라]
public class _02_CharEx {
	public static void main(String[] args) {
		System.out.println("Q. ch1='Z', ch2=38, ch3=97로 대입해라");
		System.out.println("");	
	
		System.out.println("======= ch1='Z'출력 =======");
		char ch1 = 'Z';  // 문자 값 대입
		System.out.println("ch1 : " + ch1);  
		System.out.println("char type을 정수값으로 변환 : " + (int)ch1);
		System.out.println("");	
		
		System.out.println("======= ch2=38 출력 =======");
		char ch2 = 38;  // 아스키 코드 값 대입 
		// 정수 값에 해당하는 문자를 출력한다, 디코딩
		// & 출력(없는 아스키 코드값, 변환 x)
		System.out.println("정수값을 char type으로 변환 : " + ch2);  
		System.out.println("");	
		
		System.out.println("======= ch3=97 출력 =======");
		int ch3 = 97;  // 정수형 타입
		// [정수형 변수를 문자형으로 변환 후 출력]
		System.out.println("정수형 변수값을 char type으로 변환 : " + (char)ch3);
		System.out.println("");	
	}

}
