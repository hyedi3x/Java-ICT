package ch03;

// 복합 대입 연산자 (multiple assignment operators)
public class _03_MultiAssignOperators {
	public static void main(String[] args) {
		/*
     * 5. 복합대입연산자 => 매우 중요
     */
    System.out.println("=== 5.복합대입연산자 ===");
    
    int ii = 5;
    System.out.println("ii : " + ii);
    
    ii += 10;  // 두 항의 값을 더해서 왼쪽 항에 대입
    System.out.println("ii += 10 : " + ii);
    
    ii -= 10; // 왼쪽 항에서 오른쪽 항을 빼서 그 값을 왼쪽 항에 대입
    System.out.println("ii -= 10 : " + ii);
    
    ii *= 10; // 두 항의 값을 곱해서 왼쪽 항에 대입
    System.out.println("ii *= 10 : " + ii);
    
    ii /= 10;  // 왼쪽 항을 오른쪽 항으로 나누어 그 몫을 왼쪽 항에 대입
    System.out.println("ii /= 10 : " + ii);
    
    ii %= 10; // 왼쪽 항을 오른쪽 항으로 나누어, 그 나머지를 왼쪽 항에 대입
    System.out.println("ii %= 10 : " + ii);
	}
}