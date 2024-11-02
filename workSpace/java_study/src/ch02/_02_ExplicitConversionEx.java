package ch02;

// 명시적 변환 예제
public class _02_ExplicitConversionEx {
	public static void main(String[] args) {
		System.out.println("=====명시적 형 변환 예제=====");
		double dNum2 = 1.2;
		float fNum2 = 0.9f;

		// [두 실수가 각각 정수형으로 변환 후 더해짐]
		int iNum4 = (int) dNum2 + (int) fNum2;
		System.out.println("명시적 형변환(int type으로 사전에 변환) : " + iNum4);
		System.out.println("");

		// [두 실수가 double형으로 변환 후 더해짐, 그 후 정수형으로 변환됨]
		int iNum5 = (int) (dNum2 + fNum2);
		System.out.println("명시적 형변환(double type으로 변환 후 연산, 그 후 int type으로 변환) : " + iNum5);
		System.out.println("");

		System.out.println("=====명시적 형 변환 예제2=====");
		char ch1 = 'A';
		// 문자에 해당하는 아스키코드 값(int) 출력
		System.out.println("char type->int type : " + (int) ch1);

		int ch2 = 68;
		// 아스키코드 값에 해당하는 문자 출력
		System.out.println("int type->char type : " + (char) ch2);
	}
}
