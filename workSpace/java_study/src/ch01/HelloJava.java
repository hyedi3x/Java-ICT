package ch01;     // package : 프로그램 소스들을 묶은 것

//HelloJava class 생성, class 명은 첫문자 대문자로 시작한다. 
public class HelloJava {
  /* main 함수(메서드) 생성 | 소문자로 시작한다.
	* String : 문자열을 관리하는 함수 */
  public static void main(String[] args) { 
    /* println : 화면에 출력
     * System.in : 콘솔에서 데이터를 입력받을 때 사용 
     * System.out : 콘솔에서 데이터를 출력할 때 사용 */
    System.out.println("Hello, Java");  // ; : 문장의 마침표 역할 
  }
}