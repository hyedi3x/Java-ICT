package ch04;

// If문 실습
public class _04_IfEx {
	
	public static void main(String[] args) {
		System.out.println("8살이상이면 \"학교에 다닙니다\"를 출력, 그렇지 않을 경우 \"학교에 다니지 않습니다.\" 출력, \"종료\" 출력");
		int age = 5; 
		
		// 나이가 8세이상이라면, if문 내부의 print문 수행
		if(age >= 8) {
			System.out.println("if : 학교에 다닙니다.");
		}
		
		// 그외의 나이일 때, else문 내부의 print문 수행
		else {
			System.out.println("else : 학교에 다니지 않습니다.");
		}
		System.out.println("출력 : 종료");
		System.out.println("");
	
		String result = " ";
		result = (age >= 8) ? "학교에 다닙니다." : "학교에 다니지 않습니다.";
		System.out.println(result);
	}

	
}