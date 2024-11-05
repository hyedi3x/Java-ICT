package ch04;

// print문 대신 변수 선언 후, 문자열 값 대입  
public class _04_ElseIF2 {

	public static void main(String[] args) {
		System.out.println("num이 \"양수\"인지, \"음수\"인지 \"0\"인지 출력");
		//	int num = -5;
		int num = 0;
		//	int num = 7;
		String result = "";    // 문자열 변수 result 선언 
	
		if(num > 0) {
			result = "양수";
		}
	
		else if(num == 0) {
			result = "0";
		}
	
		else {
			result = "음수";
		}
		System.out.println("결과 : " + num + "는(은) " + result);

	}

}