package ch05_01;

// 함수를 호출하고 값 반환하기 
public class _05_ReturnFunction {
	public static void main(String[] args) {
		int num1 = 10; 
		int num2 = 20;
		/* 
		  [add 함수]
		   - 함수를 호출하여, sum에 값을 대입한다.
		   - add(num1, num2) -> static int add 함수 결과값이 저장되어 있다. 
		*/
		int sum = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum+ "입니다.");
	}
	
	/* 
	  [함수 생성 : static + 자료형 + 함수명] 
	   - 클래스를 통한 new 객체 생성 없이, 함수 생성 가능
	   
	   [add 함수 구현 코드]
	   - add 함수를 구현 하는 함수 생성 
	   - main 함수에 호출한 add 함수 매개변수와 클래스 내부에 생성한 add 함수의 형태(매개변수 수와 자료형)가 동일해야 한다.
	   - 매개변수 명은 다르게 지정해도 상관없다.
	*/
	public static int add(int n1, int n2) { 
		int result = n1 + n2;
		return result; // 결과값 반환 
	}

}
