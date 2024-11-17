package ch08_04;

// [부모 클래스 : Customer 클래스 생성, 매개변수 생성자 활용] 
public class Customer2 {
	// [멤버 변수]
	private String id;    // 고객 ID
	private String name;  // 고객 명
	private String grade; // 고객 등급 
	
	// [매개변수 생성자] 
	public Customer2(String id, String name, String grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
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
