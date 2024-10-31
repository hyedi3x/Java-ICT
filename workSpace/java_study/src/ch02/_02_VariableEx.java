
package ch02;

// 변수 실습 
public class _02_VariableEx {
  public static void main(String[] args) { 
    /*
     * 변수는 변하는 값(변하는 수)을 말하며, 하나의 값을 저장하는 메모리 
       공간으로 볼 수 있다. 
     * 변수는 소문자로 시작한다. 
     * 각 자료형에 맞게 데이터를 대입해야 한다. 
    */
    System.out.println("***나의 정보***");
		
    // 정수형 변수 선언 
    int num = 3;   // 정수형 변수 num을 선언하고, 3이라는 데이터를 대입(초기화)한다. 
    System.out.println("좋아하는 숫자 : " + num); // num 값 출력 
		
    // 문자열형(문자열 자료형이며, " "로 감싼다.) 변수 선언
    String name;    // 문자열 변수 선언 
    name = "홍길동";  // name 변수에 값을 "홍길동"으로 대입(값 초기화)
    System.out.println("내 이름은 : " + name);

    // 주소 (address)
    String address = "마포구";
    System.out.println("주소는 : " + address);

    // 꿈 (dream)
    String dream = "개발자";
    System.out.println("나의 꿈은 : " + dream);
		
    // 문자형 (문자 자료형이며, 한 글자로만 작성가능, ' '로 감싼다.) 
    // 혈액형 (bloodtype)
    char bloodtype = 'O';
    System.out.println("나의 혈액형은 : " + bloodtype);
    System.out.println("-----------------");
    
    // \t : 공백 탭 생성
    System.out.println("좋아하는 숫자 : " + num + "\t이름 : " + name 
        + "\t주소 : " + address + "\t꿈 : " + dream + "\t혈액형 : " + bloodtype);
    System.out.println("-----------------");

    // \n : 줄바꿈 
    System.out.println("좋아하는 숫자 : " + num + "\n이름 : " + name 
        + "\n주소 : " + address + "\n꿈 : " + dream + "\n혈액형 : " + bloodtype);
    System.out.println("-----------------");
    
    // 함수 재선언 
    // bloodtype 변수 속 데이터를 재선언(다른 값으로 초기화)하고 싶을 때 
    bloodtype = 'B';
    System.out.println("나의 혈액형은 : " + bloodtype);
    
  }
}

