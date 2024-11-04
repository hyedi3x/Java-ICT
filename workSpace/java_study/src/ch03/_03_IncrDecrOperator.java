package ch03;

// 증가·감소 연산자 (increment and decrement operators)
public class _03_IncrDecrOperator {
	public static void main(String[] args) {
		/*
     * 2.증감 연산자 => 매우 중요
     * 1) 전위 연산자 => y = ++x; => x값을 먼저 1증가시키고, 증가한 값을 y에 대입한다.
     * 2) 후위 연산자 => y = x++; => x값을 먼저 y에 대입한 후, x값을 1증가시킨다.
     * 
     * !! 단항 연산자가 사칙 연산자보다 우선순위가 높다. 
     * !! 동일한 변수에는 최종값이 대입된다. 
     */
		
		// 전위 연산자 
		System.out.println("=== 전위 연산자 ===");
		int c = 5;
		int nextC = ++c;
		
		System.out.println("c : " + c);  // c값을 먼저 1 증가시키고, 증가한 값을 c에 대입, c = 6
		System.out.println("nextC(전위 증감연산자 적용) : " + nextC);  // nextC=6
		System.out.println("");
		
    // 후위 연산자 
		System.out.println("=== 후위 연산자 ===");
		int d = 5;
		System.out.println("d : " + d);
		
		int nextD = d++;	
		System.out.println("nextD(후위 증감연산자 적용) : " + nextD); // x값을 먼저 y에 대입한 후, nextD = 5
		System.out.println("d : " + d);   // x값을 1증가시킨다. d = 6
		System.out.println("");
			
		// 전위, 후위 연산자 예제
		System.out.println("=== 전위, 후위 연산자 ===");
		int e = 2, f = 3;
		
		System.out.println(e++ + --f * e--);  // 2 + (2 * 3)
		System.out.println("e : " + e);
		System.out.println("f : " + f);
		System.out.println("");

		// 전위, 후위 연산자 변수 대입 예제
		System.out.println("=== 전위, 후위 연산자 변수 대입 예제 ===");
		int gameScore = 150;   // 게임에서 획득한 점수 : 150점
		int lastScore1 = ++gameScore;    // gameScore에 1만큼 더한 값을 lastScore1에 대입한다.
		System.out.println("lastScore1 : " + lastScore1); //151
		
		int lastScore2 = --gameScore; // gameScore에 1만큼 뺀 값을 lastScore1에 대입한다.
		System.out.println("lastScore2 : " + lastScore2);  //150
		
		int lastScore3 = gameScore++;
		System.out.println("lastScore3 : " + lastScore3); // lastScore2값만 출력된다. 150
		
		int lastScore4 = gameScore--;
		System.out.println("lastScore4 : " + lastScore4); // lastScore3값에 +1된 값이 출력된다. 151

	}

}