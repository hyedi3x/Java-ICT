package ch02;

// 묵시적 형변환 (ImplicitConversion)
public class _02_ImplicitConversion {
	public static void main(String[] args) {
		// [type size : 소 -> 대] 
		// 자동 형변환 => 형 변환 타입 생략 가능, 자료 손실 발생 x
		// [바이트 크기가 작은 자료형에서 큰 자료형으로 대입하는 경우] 
		System.out.println("=== type size small -> big ===");
		byte bNum = 10;
		int iNum = bNum;  // byte type이 int type으로 대입됨. 
	
		System.out.println("byte type : " + bNum);  // 10
		System.out.println("byte type -> int type으로 묵시적 형변환 : " + iNum);  // 10
		System.out.println("");

		// [덜 정밀한 자료형에서 더 정밀한 자료형으로 대입하는 경우] 
		/* int형과 float형의 바이트 크기는 4바이트로 동일하지만, 
		 * float형이 더 정밀하게 데이터를 표현할 수 있기에, 값이 float형으로 변환된다.
		 */
		System.out.println("=== type size equal ===");
		int iNum2 = 20;
		float fNum = iNum2;  // int type이 float type으로 대입됨. 

		System.out.println("int type : " + iNum2);  // 10
		System.out.println("int type -> float type으로 묵시적 형변환 : " + fNum);   // 20.0
		System.out.println("");
	
		// [연산 중에 자동 변환되는 경우]
		// iNum이 float type으로 대입되어 더하기 연산 후, 
		// 최종적으로 double 타입으로 형 변환된다. 
		System.out.println("=== type conversion auto ===");
		double dNum;
		dNum = fNum + iNum; 

		System.out.println("fNum + iNum -> double type : " + dNum);  // 10.0 + 20.0 = 30.0
		System.out.println("");
	}
}