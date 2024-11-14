package ch08_01;

// [자식 클래스 : 경찰자 클래스 생성]
public class PoliceCar extends Car {
	
	// [디폴트 생성자] 
	public PoliceCar() {
		
	}

	// [경고를 울리는 기능의 메서드] 
	public void siren() {
		System.out.println("경찰차의 기능 : 사이렌을 울리다.");
	}

}
