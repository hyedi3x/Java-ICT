package ch03;

// 논리 연산자(logical operators)
public class _03_LogicalOperators {

	public static void main(String[] args) {
		/*
     * 4. 논리연산자 => 매우 중요
     * - 1 => 참(true) | 0 => 거짓(false)
     * - &&(논리곱) : 두 항이 모두 참인 경우 참 
     * - ||(논리합) : 두 항 중 하나의 항만 참이면 모두 참, 둘다 거짓이면 거짓
     */
    
    System.out.println("=== 4. 논리연산자 ===");
    int z1 = 4, y1 = 5;
    System.out.println(z1==4 && y1==5);   // true && true -> true
    System.out.println(z1==4 && y1==10);  // true && false -> false
    System.out.println(z1==4 || y1==7);   // true || false -> true
    System.out.println(z1==7 || y1==7);   // false || false -> false
    System.out.println("");
    
    System.out.println("=== 4. 논리연산자 예제2 ===");
    int num1 = 10; 
    int num2 = 20; 
    
    System.out.println("num1 : " + num1);
    System.out.println("num2 : " + num2);
    
    // true && true -> true
    boolean flag = (num1 > 0) && (num2 > 0);   
    System.out.println("(num1 > 0) && (num2 > 0) : "+ flag);
    
    // false && true -> false
    flag = (num1 < 0) && (num2 > 0);  
    System.out.println("(num1 < 0) && (num2 > 0) : "+ flag);
    
    // false || true -> true
    flag = (num1 < 0) || (num2 > 0);  
    System.out.println("(num1 < 0) || (num2 > 0) : "+ flag);
    
	}

}
