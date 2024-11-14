package ch08_07;

// [다형성 & 다운캐스팅 & instance of 실습] 
public class AnimalPolyMain {
	public static void main(String[] args) {
		// --[객체 선언하여, 메서드 오버라이딩(상속) & 기능 구현]--
		System.out.println("==== 메서드 오버라이딩(상속) ====");
		// [human 객체 생성] 
		Human human = new Human();
		human.move();  // 부모 메서드 move 오버라이드(재정의, 덮어쓰기)
		human.readBook();   // human 클래스 메서드 
		
		// [tiger 객체 생성]
		Tiger tiger = new Tiger();
		tiger.move();  // 부모 메서드 move 오버라이드(재정의, 덮어쓰기)
		
		// [eagle 객체 생성]
		Eagle eagle = new Eagle();
		eagle.move();  // 부모 메서드 move 오버라이드(재정의, 덮어쓰기)
		
		// [fish 객체 생성]
		Fish fish = new Fish();
		fish.move();  // 부모 메서드 move 오버라이드(재정의, 덮어쓰기)
		
		// ---[다형성 적용 : 메서드를 불러올때 효율적]---
		System.out.println("");
		System.out.println("==== 다형성 적용 ====");
		
		// [부모 클래스형 참조 변수 = new 자식 클래스();]
		// : 자료형이 부모 클래스여도, 재정의된 자식 메서드가 호출된다.
		// : 부모 타입으로 반환만 한것 뿐, 비효율적
		AnimalPoly aniHuman = new Human();
		aniHuman.move();  
		
		/*
		  [다운캐스팅]
		  : 부모 클래스형으로 생성된 인스턴스(자식 클래스)를 원래 자식 클래스 타입으로 변환.
			  더 큰 클래스형(부모 클래스)가 작은 클래스형(자식 클래스)만의
			  기능 메서드를 갖고 있지 않기 때문에, 다운캐스팅(형변환)을 통해 
			  원래 자식 클래스로 돌아가 메서드에 접근한다.
		*/
		// [aniHuman(부모 클래스형으로 선언된 인스턴스) 다운캐스팅]
		Human h = (Human)aniHuman;
		h.readBook();  // 자식클래스 메서드 접근 가능
		
		// [하위클래스(Tiger)가 상위클래스(AnimalPoly)로 타입 변환] 
		AnimalPoly aniTiger = new Tiger();
		aniTiger.move();  
		
		// [aniTiger(부모 클래스형으로 선언된 인스턴스) 다운캐스팅]
		Tiger T = (Tiger)aniTiger;
		T.hunting();  
		
		// [하위클래스(Eagle)가 상위클래스(AnimalPoly)로 타입 변환] 
		AnimalPoly aniEagle = new Eagle();
		aniEagle.move();  
		
		// [aniEagle(부모 클래스형으로 선언된 인스턴스) 다운캐스팅]
		Eagle e = (Eagle)aniEagle;
		e.flying();  
		
		// [하위클래스(Fish)가 상위클래스(AnimalPoly)로 타입 변환] 
		AnimalPoly aniFish = new Fish();
		aniFish.move();  
		
		// [aniFish(부모 클래스형으로 선언된 인스턴스) 다운캐스팅]
		Fish f = (Fish)aniFish;
		f.eating();  
		
		// ---[매개변수를 통한 다형성 적용]---
		System.out.println("");
		System.out.println("=== 매개변수를 통한 다형성 적용 ===");
		// animalMove()가 static으로 선언되었기에, 매개변수.animalMove로 선언하지 않아도 됨
		animalMove(new Human()); // animalMove 매서드에 Human 객체 호출
		animalMove(new Tiger());
		animalMove(new Eagle());
		animalMove(new Fish());
		
	}
	
	// [animalMove 메서드 = AnimalPoly 타입으로 자동 형(타입)변환  ]
	public static void animalMove(AnimalPoly animal) {
		animal.move();
		
		// [animal이 Human의 객체 타입일때, true : 다운캐스팅] 
		if(animal instanceof Human) {
		  // animal(부모클래스)을 Human(자식클래스) 타입으로 명시적 형변환
			Human hm = (Human)animal;
			hm.readBook();   // 자식클래스 메서드 접근 가능
		}
		// [animal이 Eagle의 객체 타입일때, 다운캐스팅]
		else if (animal instanceof Eagle) {
			Eagle eg = (Eagle)animal;
			eg.flying();			
		}
		// [animal이 Tiger의 객체 타입일때, 다운캐스팅]
		else if(animal instanceof Tiger) {
			Tiger tg = (Tiger)animal;
			tg.hunting();
		}
		// [animal이 Fish의 객체 타입일때, 다운캐스팅]
		else {
			Fish fh = (Fish)animal;
			fh.eating();
		}

	}

}
