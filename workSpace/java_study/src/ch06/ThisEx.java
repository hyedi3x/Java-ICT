package ch06;

// [this 예약어 알아보기]
public class ThisEx {
	public static void main(String[] args) {
		// [BirthDay 클래스형 객체 생성]
		BirthDay day = new BirthDay();
		day.setBirth(2024, 11, 11);  // 태어난 연,월,일을 2024, 11, 11으로 지정
		System.out.println("day(참조변수) : " + day);   // 참조 변수 출력 
		day.printThis();  // this 출력 메서드 호출 
	}
}

// [BirthDay 클래스 생성]
class BirthDay {
	int day;
	int month;
	int year;
	
	// [set() : year, month, day 값을 지정하는 메서드]
	public void setBirth(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void printThis() {
		System.out.println("this : " + this);    // 참조 변수를 가르킴 
		System.out.println("생년월일 : " + year + "년" + month + "월" + day + "일");
	}
}