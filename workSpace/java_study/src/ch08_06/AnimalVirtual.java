package ch08_06;

// [가상메서드 예제 : 오버라이드]
// [부모 클래스 : AnimalVirtual]
public class AnimalVirtual {
	public void makeSound() {
    System.out.println("Animal sound");
	}
}

// s[자식 클래스 : Dog]
class Dog extends AnimalVirtual  {
  @Override
	public void makeSound() {
      System.out.println("Bark");
  }
}

// [자식 클래스 : Cat]
class Cat extends AnimalVirtual  {
  @Override
	public void makeSound() {
      System.out.println("Meow");
  }
}
