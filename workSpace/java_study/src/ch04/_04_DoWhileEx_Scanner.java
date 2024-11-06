package ch04;

// Scanner class import 
import java.util.Scanner;

// Scanner 클래스로 값을 입력받고, do - while문으로 조건식 값 확인  
public class _04_DoWhileEx_Scanner {
	public static void main(String[] args) {
		
		// 클래스명 변수 = new 클래스명();
		Scanner scan = new Scanner(System.in);   // Scanner는 콘솔에서 값을 입력받는 클래스이다. 
		int month = 0;
		
    System.out.print("월을 입력해 주세요 (1~12): ");

    do {
    	// nextInt() : 콘솔에서 값을 입력받는 클래스이다. 
    	month = scan.nextInt(); // 사용자가 입력한 정수를 month에 저장
    	
      if (month >= 1 && month <= 12) {
          break;  // // 올바른 입력이므로 루프 종료
      }
      // 잘못된 입력일 경우 재입력 요청
      System.out.println("잘못된 월입니다. 1~12월 사이로 다시 입력하세요.");
      
    } while (month <= 0 || month > 12); // month가 1~12가 아닐 동안 반복 (유효한 값 입력 시 종료)
    
    System.out.println("입력하신 월은 : " + month +"월입니다.");

    scan.close();
		
	}
	
}