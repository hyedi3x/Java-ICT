package ch03;

// 조건 연산자 (conditional operator)
public class _03_ConditionalOperator {
	public static void main(String[] args) {
		int sisterAge = 24;
		int brotherAge = 27;
		
		char result;
	  // 24 > 27, false F가 result에 대입된다. 
		result = (sisterAge > brotherAge) ? 'T' : 'F'; 
		System.out.println(result);
		
		
		String result2;
		// 24 > 27, false 거짓이 result에 대입된다. 
		result2 = (sisterAge > brotherAge) ? "참" : "거짓"; 
		System.out.println(result2);
		
	}

}