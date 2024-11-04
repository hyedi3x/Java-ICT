package ch02;

// 2진수 실습 
public class _02_BitEx {
  public static void main(String[] args) { 
    // 양수 +5 (2진수)
    int num1 = 0B00000000000000000000000000000101; 
	  
    // 2의 보수 = 음수  
    // 음수 -5 (2진수, 양수 값을 그대로 0과 1의 값을 반전시킨 후 우측 끝자리 수만 +1해준다.)
    int num2 = 0B11111111111111111111111111111011; 
	  
    // sum 변수 선언, num1 + num2 값 대입 
    int sum = num1 + num2; 
	  
    // 출력 
    System.out.println(num1);
    System.out.println(num2);
    System.out.println(sum);
    }
}
