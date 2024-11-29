package login;

// 사용한 라이브러리들 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// 인터페이스를 구현하고, 싱글톤 패턴을 사용하는 클래스 
public class MemberDAOImpI implements MemberDAO {
	// [디폴트 생성자]  
	private MemberDAOImpI() {
		System.out.println("<<디폴트 생성자>>");
	}
	// [DB 연결 정보] 
	String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";   // jdbc:사용하는 프로그램툴:thin:@Host:PORT:SID
	String dbID = "scott_04";      // 오라클 계정
	String dpPassword = "tiger";   // 오라클 비번
	
	// [jdbc 설치 (카페 설치 방법 참조)]
	// C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\ojdbc6.jar
	
	// [라이브러리 변수 초기화]
	Connection conn = null;   // 오라클 연결 라이브러리
	PreparedStatement pstmt = null;  // sql 문장을 사용할 수 있게 해주는 라이브러리 
	ResultSet rs = null;   // sql 실행 결과를 가지고 오는 라이브러리 (Select)
	
	// [static으로 유일한 인스턴스 생성] 
	private static MemberDAOImpI memberDAOImp = new MemberDAOImpI();

	// [외부에서 인스터스 참조 가능한 public 메서드 만들기]  
	public static MemberDAOImpI getMemberDAOImp() {
	  // 이미 존재하는 인스턴스인지 확인 
		if(memberDAOImp == null) {
			memberDAOImp = new MemberDAOImpI();
		}
		return memberDAOImp;   // 유일하게 생성한 인스턴스 반환 
	}
	
	// [login 메서드 재정의] 
	@Override
	public int login(MemberDTO dto) {
		int loginCnt = 0;  
		System.out.println("[로그인]");
		// --[sql query문을 불러와 변수에 담기]--
	  String query = "Select ?, ? "
	  		+ "FROM jdbc_member_tb "
	  		+ "WHERE id = ?";
	  
	  // --[DB 접속 exception 처리]-- 
	  try {
	  	// [DB 접속/연결]
	  	conn = DriverManager.getConnection(dbURL, dbID, dpPassword);
	  	
	  	// [쿼리 연결]
	  	pstmt = conn.prepareStatement(query);
	  	pstmt.setString(1, dto.getID());    		 // 1: 물음표 위치
	  	pstmt.setString(2, dto.getPassword());   // 2: 물음표 위치
	  	pstmt.setString(3, dto.getID());         // 3: 물음표 위치

	  	// [SQL 실행 함수 -> 1 : 성공 0: 실패] 
	  	loginCnt = pstmt.executeUpdate(); 
	  } 
	  catch(SQLException e) {
	  	e.printStackTrace();
	  }
	  finally {
	  	try {
	    	if(pstmt != null) pstmt.close();  
	    	if(conn != null) conn.close();
	  	}
	  	catch(SQLException e) {
	    	e.printStackTrace();
	  	}
	  } return loginCnt;  // excuteUpdate 결과값 반환 (1 : 성공 0: 실패)
	}

	// [Insert 메서드 재정의] 
	@Override
	public int memberInsert(MemberDTO dto) {
		int insertCnt = 0;  // excuteUpdate 1과 0으로 값을 반환해서 정수로 변환 
		System.out.println("[회원가입 정보]");
    // --[sql query문을 불러와 변수에 담기]--
    // : Insert와 Values 사이 공백 필요함
    String query = "INSERT INTO jdbc_member_tb (id, password, gender, email, address) " 
        // + "VALUES('test', 't1234', '여성', 'test@gmail.com', '서울')";
        // + "VALUES(dto.getID(), dto.getPassword(), dto.getGender(), dto.getEmail(), dto.getAddress())";
        + "VALUES(?, ?, ?, ?, ?)";

    // --[DB 접속 exception 처리]--
    try {
    	// [DB 접속/연결]
    	// :오라클 연결 라이브러리 변수에 url, id, password 연결 
    	conn = DriverManager.getConnection(dbURL, dbID, dpPassword);
    	
    	// [쿼리 연결]
    	// : sql 문장을 사용할 수 있게 해주는 라이브러리 
    	pstmt = conn.prepareStatement(query);
    	pstmt.setString(1, dto.getID());        // 1: 물음표 위치
    	pstmt.setString(2, dto.getPassword());  // 2: 물음표 위치
    	pstmt.setString(3, dto.getGender());    // 3: 물음표 위치
    	pstmt.setString(4, dto.getEmail());     // 4: 물음표 위치
    	pstmt.setString(5, dto.getAddress());   // 5: 물음표 위치
    	
    	// [SQL 실행 함수 -> ctrl + enter] 
    	// : 입력, 수정, 삭제의 SQL 실행 -> 1 : 성공 0: 실패
    	insertCnt = pstmt.executeUpdate(); 
//    	System.out.println("insertCnt : " + insertCnt);
    } 
    catch(SQLException e) {
    	e.printStackTrace();
    }
    finally {
    	try {
      	if(pstmt != null) pstmt.close();  
      	if(conn != null) conn.close();
    	}
    	catch(SQLException e) {
      	e.printStackTrace();
    	}
    } return insertCnt;  // excuteUpdate 결과값 반환 (1 : 성공 0: 실패)

    // [DB 연결전 코드]
    // System.out.println("ID: " + dto.getID());
    // System.out.println("비밀번호: " + dto.getPassword());
    // System.out.println("성별: " + dto.getGender());
    // System.out.println("이메일: " + dto.getEmail());
    // System.out.println("주소: " + dto.getAddress());

	}

	// [Update 메서드 재정의] 
	@Override
	public int memberUpdate(MemberDTO dto) {
		int updateCnt = 0;  
		System.out.println("[회원 정보 수정]");
		// --[sql query문을 불러와 변수에 담기]--
    String query = "UPDATE jdbc_member_tb "
    		+ "SET gender = ?, email = ?, address = ?  "
    		+ "WHERE id = ?";
    
    // --[DB 접속 exception 처리]--
    try {
    	// [DB 접속/연결]
    	conn = DriverManager.getConnection(dbURL, dbID, dpPassword);
    	
    	// [쿼리 연결]
    	pstmt = conn.prepareStatement(query);
    	pstmt.setString(1, dto.getGender()); 
    	pstmt.setString(2, dto.getEmail()); 
    	pstmt.setString(3, dto.getAddress()); 

    	pstmt.setString(4, dto.getID());  
    	
    	// UPDATE 실행
      updateCnt = pstmt.executeUpdate(); // executeUpdate 사용
    } 
    catch(SQLException e) {
    	e.printStackTrace();
    }
    finally {
    	try {
      	if(pstmt != null) pstmt.close();  
      	if(conn != null) conn.close();
    	}
    	catch(SQLException e) {
      	e.printStackTrace();
    	}
    } return updateCnt;  // excuteUpdate 결과값 반환 (1 : 성공 0: 실패)
	}

	// [Delete 메서드 재정의] 
	@Override
	public int memberDelete(MemberDTO dto) {
		int deleteCnt = 0;  
		System.out.println("[회원 정보 삭제]");
		// --[sql query문을 불러와 변수에 담기]--
	  String query = "Delete jdbc_member_tb "
	  		+ "WHERE id = ? ";

	  // --[DB 접속 exception 처리]-- 
	  try {
	  	// [DB 접속/연결]
	  	conn = DriverManager.getConnection(dbURL, dbID, dpPassword);
	  	
	  	// [쿼리 연결]
	  	pstmt = conn.prepareStatement(query);
	  	pstmt.setString(1, dto.getID());     // 1: 물음표 위치
	  	
	  	// [SQL 실행 함수 -> 1 : 성공 0: 실패] 
	  	deleteCnt = pstmt.executeUpdate(); 
	  } 
	  catch(SQLException e) {
	  	e.printStackTrace();
	  }
	  finally {
	  	try {
	    	if(pstmt != null) pstmt.close();  
	    	if(conn != null) conn.close();
	  	}
	  	catch(SQLException e) {
	    	e.printStackTrace();
	  	}
	  } return deleteCnt;  // excuteUpdate 결과값 반환 (1 : 성공 0: 실패)
	}

	@Override
	public int memberSelect(MemberDTO dto) {
		int selectCnt = 0;  
		System.out.println("[회원 정보 조회]");
		// --[sql query문을 불러와 변수에 담기]--
	  String query = "Select id, password, gender, email, address  "
	  		+ "FROM jdbc_member_tb "
	  		+ "WHERE id = ?";
	  
	  // --[DB 접속 exception 처리]-- 
	  try {
	  	// [DB 접속/연결]
	  	conn = DriverManager.getConnection(dbURL, dbID, dpPassword);
	  	
	  	// [쿼리 연결]
	  	pstmt = conn.prepareStatement(query);
    	pstmt.setString(1, dto.getID());        
    	
    	 rs = pstmt.executeQuery();
       if (rs.next()) {
           dto.setID(rs.getString("id"));
           dto.setPassword(rs.getString("password"));
           dto.setGender(rs.getString("gender"));
           dto.setEmail(rs.getString("email"));
           dto.setAddress(rs.getString("address"));
           // [SQL 실행 함수 -> 1 : 성공 0: 실패] 
           selectCnt = pstmt.executeUpdate(); }
	  } 
	  catch(SQLException e) {
	  	e.printStackTrace();
	  }
	  finally {
	  	try {
	    	if(pstmt != null) pstmt.close();  
	    	if(conn != null) conn.close();
	  	}
	  	catch(SQLException e) {
	    	e.printStackTrace();
	  	}
	  } return selectCnt;  // excuteUpdate 결과값 반환 (1 : 성공 0: 실패)
	}

}
