package ch05;

// [생성자 알아보기] 
public class Person {
	String name;    // 이름
	float height;   // 키
	float weight;   // 몸무게 
	
	// [디폴트 생성자 (자바 컴파일러가 자동으로 제공하는)]
	// public + 클래스명 () {}
	public Person() {} 
	
	// [사람 이름을 매개변수로 입력받아서 Person 클래스를 생성하는 생성자] 
	// public + 클래스명 (자료형 + 멤버변수) {}
	public Person(String pname) {
		name = pname;		
	}

  // [생성한 모든 멤버변수를 입력받아서 Person 클래스를 생성하는 생성자] 
	// public + 클래스명 (자료형 + 멤버변수, 자료형 + 멤버변수 ...) {}
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
	
	// [출력 메서드 (printInfo)]
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("");
	}
}
