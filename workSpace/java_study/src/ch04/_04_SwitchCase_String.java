package ch04;

// switch-case 문 case 값에 문자열 사용하기(실습)
public class _04_SwitchCase_String {
	
	public static void main(String[] args) {
		String medalColor = "Silver";   // 메달 색상을 silver로 지정 
		
		switch(medalColor) {
			case "Gold" : 
				System.out.println("금메달입니다.");
				break;
			case "Silver" : 
				System.out.println("은메달입니다.");
				break;
			case "Bronze" : 
				System.out.println("동메달입니다.");
				break;
			default : 
				System.out.println("메달이 없습니다.");			
				
		}

	}

}