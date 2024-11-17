
package ch05;

// [참조변수, 참조값 알아보기]
public class ReferenceType {
  public static void main(String[] args) {

    // [Student 클래스를 student1 변수에 대입, 인스턴스 1]
    Student student1 = new Student();
    student1.studentName = "영희"; 	
		
    // [Student 클래스를 student2 변수에 대입, 인스턴스 2]
    Student student2 = new Student();
    student2.studentName = "영희"; 	
		
    System.out.println(student1);  // 참조변수 student1 주소값(해시코드) 출력 
    System.out.println(student2);  // 참조변수 student1 주소값(해시코드) 출력 
  }
}
