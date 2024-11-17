package ch08_07;

// [자식 클래스(Tiger) : 부모 클래스 AnimalPoly를 상속받음] 
public class Tiger extends AnimalPoly {
	@Override
	// [공통 메서드 -> 재정의]
	public void move() {
		System.out.println("호랑이가 네 발로 뛴다.");
	}
	
	// [Tiger 기능 메서드 : hunting()]
	public void hunting() {
		System.out.println("호랑이가 사냥을 한다.");
	}
}
