package ch06;

// [학생 클래스] 
public class Student {
	// [멤버 변수(속성)]
	String studentName; // 학생 이름 
	int grade;   // 학년
	int money;   // 학생이 가지고 있는 돈

	// [학생의 이름과 돈을 매개변수로 받는 생성자]
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// [학생이 버스를 타면 1000원 지불하는 기능 메서드]
	public void takeBus(Bus bus) {   // Bus 클래스 자료형
		bus.take(1000);
		this.money -= 1000; 
	}
	
	// [학생이 지하철을 타면 1500원 지불하는 기능 메서드]
	public void takeSubway(Subway subway) { // Subway 클래스 자료형
		subway.take(1500);
		this.money -= 1500; 
	}
	
	// [학생의 현재 정보를 출력하는 메서드]
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
	
}
