package ch08_02;

// [부모 클래스 Animal]
public class Animal {
	// [멤버 변수, Cat & Dog 클래스의 공통 변수] 
	private String kind;  // 종류
	private int legs;     // 다리 수
	private int weight;   // 체중
	
	// [디폴트 생성자]
	public Animal() {
		
	}
	
	// [get, set]
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getLegs() {
		return legs;
	}
	
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	// [출력 메서드] 
	public void printInfo() {
		System.out.println("종류 : " + kind);
		System.out.println("다리 수 : " + legs + "개");
		System.out.println("체중 : " + weight + "kg");
	}
	
}
