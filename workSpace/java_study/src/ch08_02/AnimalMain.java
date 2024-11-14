package ch08_02;

// [클래스를 읽어와 기능을 구현하는 main 클래스]
public class AnimalMain {
	public static void main(String[] args) {
		// [dog 객체 생성 + setter로 값 전달]
		Dog dog = new Dog();
		// [부모 클래스 Animal set메서드 사용 가능]
		dog.setKind("강아지");
		dog.setLegs(4);
		dog.setWeight(8);
		
		System.out.println("=== 강아지 정보 ===");
		// [부모 클래스 Animal 출력 메서드 사용 가능]
		dog.printInfo();
		// [dog 클래스 멤버 메서드]
		dog.bark();
		System.out.println("");
		
		// [cat 객체 생성 + setter로 값 전달]
		Cat cat = new Cat();
		// [부모 클래스 Animal set메서드 사용 가능]
		cat.setKind("고양이");
		cat.setLegs(4);
		cat.setWeight(4);
		
		System.out.println("=== 고양이 정보 ===");
		// [부모 클래스 Animal 출력 메서드 사용 가능]
		cat.printInfo();
		// [cat 클래스 멤버 메서드]
		cat.cry();
	}
}
