package ch08_03;

// [부모 클래스 : Customer 클래스 생성, 디폴트 생성자 활용] 
public class Customer {
	// [멤버 변수]
	private String id;    // 고객 ID
	private String name;  // 고객 명
	private String grade; // 고객 등급 
	
	// [디폴트 생성자] 
	public Customer() {
		System.out.println("===== 백화점 고객 정보 =====");

	}
	
	// [get(), set()] 
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}

	// [출력 메서드] 
	public void printInfo() {
		System.out.println("ID : " + id);
		System.out.println("이름 : " + name);
		System.out.println("등급 : " + grade);
	}

}
