package ch02;

//정수형 자료형 실습 
public class _02_IntegerType {
	public static void main(String[] args) {
		// [정수형 종류]
		// byte | short(2byte) | int(4byte, default) | long(8byte)
		System.out.println("========정수형 변수========");
		
		/* [byte형(8bit, 1byte)]
		 * 유효 범위값 : -128 ~ 127 유효 범위값을 가진다. 
		 */
		byte bs1 = -128;
		System.out.println("byte : " + bs1);
		
		/* [int형(32bit, 4byte)] 
		 * 유효 범위값 : -2,147,483,648 ~ 2,147,483,647
		 * 컴퓨터에서 정수로 연산을 할 때, `4바이트 단위로 처리하는 것이 가장 효율적`이기 때문에
		 */ 
		int num1 = 10;
		System.out.println("int : " + num1);
			
		/* [long형 (64bit, 8byte)]
		 * int형의 범위를 넘어서는 정수값을 사용할 때, long형을 사용
		 * long형은 숫자 뒤에 L이나 l(식별자)을 붙인다. 컴파일러가 int형과 구분할 수 있게 
		 */ 
		long lnum1 = 12345678900L;  
		long lnum2 = 12345678900l; 
		System.out.println("long : " + lnum1 + ", " + lnum2);
		
		/* [int형의 범위 값을 넘지 않는 데이터를 대입할 경우] 
		 * long 타입을 선언해도 L이나 l 식별자 없이도, 자동으로 int형으로 형 변환이 된다. 
		 * 하지만, 메모리 낭비가 발생함
		 */
		long lnum3 = 1000;  
		System.out.println("long : " + lnum3);
		System.out.println("");
		
		// [서로 다른 타입 정수간의 연산] 
		System.out.println("======== 서로 다른 타입의 정수 끼리 연산 ========");
		
		// 자동 형 변환 (int형 정수로 자동 변환되어 연산된다.)
		System.out.println("byte + int : " + bs1 + num1);
	}
}
