package ch08_01;

// [클래스를 읽어와 기능을 구현하는 main 클래스]
public class CarMain {
	public static void main(String[] args) {
		// [소방차 객체 생성 + setter로 값 전달]
		FireCar fc = new FireCar();
		// [부모 클래스 Car set메서드 사용 가능]
		fc.setKind("소방차");   
		fc.setSpeed(80);
		fc.setColor("red");
		
		System.out.println("=== 소방차 정보 ===");
		// [부모 클래스 Car 출력 메서드 사용 가능]
		fc.printInfo();
		// [FireCar 클래스 멤버 메서드]
		fc.water();
		System.out.println("");
		
		// [경찰차 객체 생성 + setter로 값 전달]
		PoliceCar pc = new PoliceCar();
		// [부모 클래스 Car set메서드 사용 가능]
		pc.setKind("경찰차");
		pc.setSpeed(100);
		pc.setColor("white");
			
		System.out.println("=== 경찰차 정보 ===");
		// [부모 클래스 Car 출력 메서드 사용 가능]
		pc.printInfo();
		// [PoliceCar 클래스 멤버 메서드]
		pc.siren();
	}
  /*
  	상속 : 자식 클래스 extends 부모 클래스 { .... }
  	- extends : 확장하다의 의미
  	- 공통으로 사용하는 멤버 변수와 멤버 메서드를 부모 클래스에서 정의한다.
  	- 부모 클래스는 일반적이고 공통적이며, 자식 클래스는 구체적이고 유일하다.
  	- 사용이유 : 부모 클래스의 멤버 변수와 멤버 메서드를 재사용.
              중복되는 코드를 줄임으로써 손쉽게 개발, 유지 보수 가능
  	- 부모 클래스의 멤버를 private으로 선언한 경우, 자식 클래스에서 접근할 수 없다.
  	- 접근제어자 protected의 경우 자식 클래스에서 접근 가능
   */
}
