package ch05;

public class PersonMain {
	public static void main(String[] args) {
		// [객체 생성 (디폴트 생성자)]
		Person personLee = new Person();
		personLee.name = "이순신";
		personLee.height = 180;
		personLee.weight = 60;
		
		personLee.printInfo();
		
		// [객체 생성 (생성한 모든 멤버변수를 입력받아서 Person 클래스를 생성하는 생성자)]
		Person personKim = new Person("김유신", 190, 65);
		personKim.printInfo();
	}
}
