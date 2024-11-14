package ch08_05;

// [부모 클래스 : Customer3 클래스 생성] 
// 부모 멤버변수 접근 제어자 `protected`로 변경 -> 잘 사용하지 않음 
public class Customer3 {
	// [멤버 변수]
	protected String id;    // 고객 ID
	protected String name;  // 고객 명
	protected String grade; // 고객 등급 
	
	// [디폴트 생성자] 
	public Customer3() {

	}
	
	// [매개변수 생성자] 
	public Customer3(String id, String name, String grade) {
		this.id = id; 
		this.name = name; 
		this.grade = grade;
	}
	
	// [get, set] 
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
		System.out.println(id);
		System.out.println(name);
		System.out.println(grade);
	}
	
}
