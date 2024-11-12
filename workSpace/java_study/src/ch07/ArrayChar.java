package ch07;

// {문자 저장 배열} 
public class ArrayChar {
	public static void main(String[] args) {
		// [문자 자료형 alphabets 변수에 char 요소 26개를 할당한다.] 
		char[] alphabets = new char[26];
		char ch = 'A';  // ch 변수 초기값을 A로 지정
		
		// [인덱스 i -> 1씩 증가, ch 변수값 -> 1씩 증가]
		// alphabets 배열 길이만큼 반복(26번), (A~Z)
		for(int i=0; i<alphabets.length; i++, ch++) {
			alphabets[i] = ch;
		}
		
		// [인덱스 i -> 1씩 증가]
		// alphabets 배열 길이만큼 반복(26번), int형으로 형변환(65~90)
		for(int i=0; i<alphabets.length; i++) {
			System.out.println("alphabets[" + alphabets[i] + "]" + "," 
		    + "정수형 코드값 : "+ (int)alphabets[i]);
		}

	}

}
