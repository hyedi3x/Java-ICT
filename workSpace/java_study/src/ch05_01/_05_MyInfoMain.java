package ch05_01;

//내 정보를 출력한 Main 클래스 
public class _05_MyInfoMain {
	public static void main(String[] args) {
		// [동작 구현 1] 객체 생성 
		_05_MyInfo mf = new _05_MyInfo();
		
		// [동작 구현2] setter로 값 전달  
		mf.setMyInfo("홍길동", "2024년 11월 7일", 100000, "경기도 고양시");
		
		// [동작 구현 7] 멤버 메서드(PrintInfo)를 불러옴  
		mf.PrintInfo();

	}
	
}