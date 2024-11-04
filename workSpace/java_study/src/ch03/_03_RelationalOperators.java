package ch03;

// 관계 연산자(Relational operators)
public class _03_RelationalOperators {

	public static void main(String[] args) {
		/*
     * 3. 관계연산자 => 매우 중요
     * - >, <, >=, <=, 같다(==), 같지 않다(!=)
     * - 결과값은 boolean 타입 : 참(true), 거짓(false) 
     */
    System.out.println("=== 3. 관계연산자 ===");
    
		int c1 = 10;
		int c2 = 20;
		
		System.out.println("c1 == c2 : " + (c1==c2));  // 두 개 항이 같으면 T
		System.out.println("c1 != c2 : " + (c1!=c2));  // 두 개의 항이 다르면 T
		System.out.println("c1 > c2 : " + (c1 > c2));  // 왼쪽 항이 크면 T
		System.out.println("c1 < c2 : " + (c1 < c2));  // 오른쪽 항이 크면 T
		System.out.println("c1 >= c2 : " + (c1 >= c2)); // 왼쪽 항이 더 크거나 같으면 T
		System.out.println("c1 <= c2 : " + (c1<=c2));   // 오른쪽 항이 더 크거나 같으면 T

	}

}