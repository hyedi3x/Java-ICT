package login;

import java.util.Scanner;

public class MemberService {
  public static void main(String[] args) {
    // --- [인스턴스 생성] ---
    MemberDAOImpI dao = MemberDAOImpI.getMemberDAOImp();  // 싱글톤 인스턴스 참조
    MemberDTO dto = new MemberDTO();    // DTO 객체 생성 
    Scanner scan= new Scanner(System.in);    // 스캐너 라이브러리 불러오기 
  	
    // [로그인]  
    // 로그인 ID 입력
    System.out.println("[로그인]");
    System.out.print("ID: ");
    dto.setID(scan.nextLine());
    
    System.out.println("Password: ");
    dto.setPassword(scan.nextLine());

    // DAO의 login메서드 호출
    int loginCnt = dao.login(dto);
  	if (loginCnt == 1) {
  		System.out.println("로그인 성공하였습니다.");  	
  		System.out.println("옵션을 선택하세요 1 : 정보 조회 2 : 정보 수정 3 : 회원 정보 삭제");
  		int option = scan.nextInt();
  		switch (option) {
  			case 1 : 
  				// [정보를 조회] 
  		    // 아이디 입력 
  		    System.out.println("--[회원 정보 조회 페이지]--");
  		    // DAO의 Select메서드 호출
  		    int selectCnt = dao.memberSelect(dto);
  		  	if (selectCnt == 1) {
  		  		System.out.println(dto.getID() + "님의 회원 정보가 조회되었습니다.");
  		      System.out.println("ID: " + dto.getID());
  		      System.out.println("비밀번호: " + dto.getPassword());
  		      System.out.println("성별: " + dto.getGender());
  		      System.out.println("이메일: " + dto.getEmail());
  		      System.out.println("주소: " + dto.getAddress()); 		  		
  		  	}
  		  	else { 
  		  		System.out.println(dto.getID() + "님의 회원 정보 조회를 실패하였습니다.");
  		  	} break;
  			case 2 : 
  		    System.out.println("--[회원 정보 수정 페이지]--");
  		    System.out.println(dto.getID() + "님의 회원 정보를 수정합니다.");

  		    System.out.println("수정할 성별: ");
  		    scan.nextLine(); // 버퍼에 남은 엔터를 소진 (nextInt() 이후 필수)
  		    dto.setGender(scan.nextLine());

  		    System.out.println("수정할 이메일: ");
  		    dto.setEmail(scan.nextLine());

  		    System.out.println("수정할 주소: ");
  		    dto.setAddress(scan.nextLine());

  		    // DAO의 Update 메서드 호출
  		    int updateCnt = dao.memberUpdate(dto);
  		    if (updateCnt == 1) {
  		        System.out.println("회원 정보 수정이 완료되었습니다.");
  		        
  		        // DAO의 Select 메서드 호출로 결과 확인
  		        int selectCnt2 = dao.memberSelect(dto);
  		        if (selectCnt2 == 1) {
  		            System.out.println("수정된 회원 정보:");
  		            System.out.println("ID: " + dto.getID());
  		            System.out.println("비밀번호: " + dto.getPassword());
  		            System.out.println("성별: " + dto.getGender());
  		            System.out.println("이메일: " + dto.getEmail());
  		            System.out.println("주소: " + dto.getAddress());
  		        }
  		    } else { 
  		        System.out.println("회원 정보 수정에 실패하였습니다.");
  		    } break;
  			case 3 : 
  		    // [회원 삭제] 
  		    // 아이디 입력 
  		    System.out.println("--[회원 정보 삭제 페이지]--");
  		    // DAO의 Delete메서드 호출
  		    int deleteCnt = dao.memberDelete(dto);
  		  	if (deleteCnt == 1) {
  		  		System.out.println(dto.getID() + "님의 회원 정보가 삭제되었습니다.");  		
  		  	}
  		  	else { 
  		  		System.out.println(dto.getID() + "님의 회원 정보 삭제를 실패하였습니다.");
  		  	} break;
  		  default : 
  		  	System.out.println("없는 옵션입니다. 홈페이지로 이동합니다. ");
  		}
  	}
  	else { 
  		System.out.println("로그인 실패하였습니다.");
      // [회원가입 정보 삽입] 
      // 로그인 ID 입력
      System.out.println("--[회원가입]--");
      System.out.print("ID: ");
      dto.setID(scan.nextLine());

      System.out.print("Password: ");
      dto.setPassword(scan.nextLine());

      System.out.print("성별: ");
      dto.setGender(scan.nextLine());      
      
      System.out.print("이메일: ");
      dto.setEmail(scan.nextLine());
      
      System.out.print("주소: ");
      dto.setAddress(scan.nextLine());
      
      // DAO의 Insert 메서드 호출
      int insertCnt = dao.memberInsert(dto);
    	if (insertCnt == 1) {
    		System.out.println("회원 가입 성공하였습니다.");  		
    	}
    	else { 
    		System.out.println("회원 가입 실패되었습니다.");
    	}
  	}
  
    // 스캐너 닫기
    scan.close();
  }
}

