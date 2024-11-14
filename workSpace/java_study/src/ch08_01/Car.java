package ch08_01;

// [부모클래스인 Car 클래스 생성]
public class Car {
	
	// [멤버 변수] 
	private String kind;    // 차 종류
	private int speed;      // 속도
	private String color;   // 색상 
	
	// [get, set 메서드]
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	// [출력 메서드]
	public void printInfo() {
		System.out.println("차 종류 : " + kind);
		System.out.println("차 속도 : " + speed);
		System.out.println("차 색상 : " + color);
	}

}
