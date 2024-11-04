package ch02;

// 명시적 형변환 
public class _02_ExplicitConversion {
	public static void main(String[] args) {
		// [type size : 대 -> 소] 
		// 강제 형변환 => 형변환 생략 불가능, 자료 손실이 발생 O
		// 강제로 자료형을 변경하려면, 변경할 자료형을 괄호로 명시해줘야한다.

		// [바이트 크기가 큰 자료형에서 작은 자료형으로 대입하는 경우] 
		System.out.println("=== type size big -> small ===");
		int iNum = 10;
		byte bNum = (byte)iNum;  // int(4byte) -> byte(1byte) 대입됨. 
			
	  // 10, 10은 1바이트로 표현이 가능하기에 자료 손실이 없다. 
		System.out.println("int type : " + iNum);  // 10
		System.out.println("int type->byte type으로 명시적 형변환 : " + bNum);  
		System.out.println("");
		
		// [byte형이 표현할 수 있는 범위를 넘는 경우 자료 손실 발생]
		System.out.println("=== type size over ===");
		int iNum2 = 1000;
		byte bNum2 = (byte)iNum2;  // int(4byte) -> byte(1byte) 대입됨. 
				
		// 1000, 1000은 byte형이 표현할 수 있는 범위를 넘어, 자료 손실이 발생한다. 
		System.out.println("int type : " + iNum2);  // 1000
		System.out.println("int type->byte type으로 명시적 형변환 : " + bNum2); 
		System.out.println("자료 손실 발생(1000 -> -24)");
		System.out.println("");

		// [더 정밀한 자료형에서 덜 정밀한 자료형으로 대입하는 경우]
		System.out.println("=== type size big -> small ===");
		double dNum = 3.14;
		int iNum3 = (int)dNum;  // double형(8바이트)을 int형(4바이트)로 형 변환

		// 3, 실수의 소수점 이하가 생략되고, 정수 부분만 출력된다. 
		System.out.println("double type : " + dNum);  // 3.14
		System.out.println("double type->int type으로 명시적 형변환 : " + iNum3); 
		System.out.println("자료 손실 발생(3.14 -> 3)");
		System.out.println("");
	}
}

