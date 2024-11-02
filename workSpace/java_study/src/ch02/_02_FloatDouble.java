package ch02;

//실수형 자료형, float형과 double 형이 있다. 
public class _02_FloatDouble {
	public static void main(String[] args) {
		// [double 타입(8byte, 실수형 기본형)] 
		// double형은 식별자가 없다, 자바에서 주로 쓰는 실수형이다.  
		double dnum = 3.14;
		
		// [float 타입(4바이트)] 
		// float형은 숫자 뒤에 F 또는 f(식별자)를 붙여야만 한다.
		float fnum = 3.14f;
		
		System.out.println("double type : " + dnum);
		System.out.println("float type : " + fnum);
	}
}