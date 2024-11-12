package ch06;

// [this를 통해 다른 생성자를 호출]
public class CallAnotherThis {
	public static void main(String[] args) {
		// [Person1 클래스형 객체 생성]
		Person1 pr = new Person1();
		System.out.println(pr.name);
		System.out.println(pr.age);		
	}
}

// [Person1 클래스 생성] 
class Person1 { 
	String name;    // 이름
	int age;        // 나이
	
	// [디폴트 생성자] 
	Person1() {
		// [this를 사용해 Person1(string, int) 매개변수 생성자 호출]
		this("혜리", 24);    
	}
	
	// [모든 매개변수의 초기값을 지정하는 매개변수 생성자]
	Person1(String name, int age){
		this.name = name;
		this.age = age;
	}
}
