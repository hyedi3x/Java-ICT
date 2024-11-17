package ch05;

// [2개 이상의 인스턴스 생성하기] 
public class InstanceStudent {
  public static void main(String[] args) {
		
    // [Student 클래스를 student1 변수에 대입, 인스턴스 1]
    Student student1 = new Student(); 
    student1.studentName = "영희"; 
    System.out.println("student1.studentName : " + student1.studentName);

    // [Student 클래스를 student2 변수에 대입, 인스턴스 2]
    Student student2 = new Student(); 
    student2.studentName = "철수"; 
    System.out.println("student2.studentName : " + student2.studentName);
  }	

}
