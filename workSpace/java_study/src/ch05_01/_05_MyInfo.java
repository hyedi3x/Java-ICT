package ch05_01;

// 내 정보를 담은 클래스 
public class _05_MyInfo {
	// 멤버 변수(속성) 
	// [동작 구현 5] 멤버변수로 값을 전달 받는다. 
	// private : _05_Book2 클래스 내부에서만 값을 입력받는다. 
	private String name;
	private String birthday;
	private int money;
	private String address; 
	
	// 멤버 메서드 (동작, 기능 구현)
	//setter 사용 
	
	// [동작 구현 3] 매개변수 String name, String birthday, int money, String address 값을 전달 받는다.  
	public void setMyInfo(String name, String birthday, int money, String address) {
		this.name = name;           // [동작 구현 4] mf.setMyInfo(name) 값 불러옴
		this.birthday = birthday;   // [동작 구현 4] mf.setMyInfo(birthday) 값 불러옴
		this.money = money;         // [동작 구현 4] mf.setMyInfo(money) 값 불러옴
		this.address = address;     // [동작 구현 4] mf.setMyInfo(address) 값 불러옴
	}
	
	// [출력 기능, 내부 메서드]
	// [동작 구현 6] 멤버 변수에 대입된 값을 출력 
	public void PrintInfo() {
		System.out.println("저의 이름은 : " + name);
		System.out.println("저의 생일은 : " + birthday);
		System.out.println("저의 지갑속 돈은 : " + money);
		System.out.println("저의 주소는 : " + address);
		
	}

}

