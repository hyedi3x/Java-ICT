package ch08_06;

public class AnimalVirtualMain {
	public  static void main(String[] args) {
		/*
		  AnimalVirtual : 선언된 클래스형(상위 클래스) 
		  vc : (참조변수) 
		  new Dog : 생성된 인스턴스의 클래스형(하위 클래스)
		 
		  AnimalVirtual myAnimal1 = new Dog();
		  -> Dog 클래스로 인스턴스를 생성할 때, AnimalVirtual 클래스형으로 자료형 변환되어 선언 (업캐스팅)
		 */
		AnimalVirtual myAnimal1 = new Dog();
		AnimalVirtual myAnimal2 = new Cat();

		// [가상메서드의 실행 -> 선언한 클래스형이 아닌, 생성된 인스턴스의 메서드를 호출]
		myAnimal1.makeSound(); // 출력: Bark
		myAnimal2.makeSound(); // 출력: Meow

	}	
}
