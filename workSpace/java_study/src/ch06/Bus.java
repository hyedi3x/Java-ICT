package ch06;

// [버스 클래스] 
public class Bus {
	// [멤버 변수(속성)]
	int busNumber;       // 버스 번호 
	int passengerCount;  // 승객수
	int money;   // 버스 수입
	
	// [버스 번호를 매개변수로 받는 생성자] 
	public Bus(int busNumber) {
		this.busNumber = busNumber; 
	}
	
	// [승객이 버스에 탑승한 경우의 메서드]
	public void take(int money) {
		this.money += money;  // 버스 수입 증가
		passengerCount++;     // 승객 수 증가 
	}
	
	// [버스 정보를 출력하는 메서드] 
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount 
				+ "명이고, 수입은 " + money + "입니다.");
	}
	
}
