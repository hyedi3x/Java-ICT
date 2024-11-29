package login;


// 인터페이스 
public interface MemberDAO{
	public int login (MemberDTO dto);  // 로그인 되었다.
	public int memberInsert(MemberDTO dto); // 회원가입 성공
	public int memberUpdate(MemberDTO dto); // 회원 정보 수정
	public int memberDelete(MemberDTO dto); // 회원 삭제 
	public int memberSelect(MemberDTO dto); // 회원조회

}
