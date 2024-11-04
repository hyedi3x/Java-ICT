package ch02;

// 상수 선언 
public class _02_Constant {
	public static void main(String[] args) {
		// [double 타입의 상수 TRACK_WIDTH 선언과 동시에 초기화]
		// TRACK_WIDTH의 초깃값 110.2
		final double TRACK_WIDTH = 110.2;
		
		// [double 타입의 상수 TRACK_HEIGHT 선언과 동시에 초기화]
		// TRACK_HEIGHT의 초깃값 0
		final double TRACK_HEIGHT;
	
		// 상수를 출력하기 전에 값을 초기화해야 한다. (초기화 x -> error) 
		TRACK_HEIGHT = 0;  
	
		System.out.println("트랙의 너비 : " + TRACK_WIDTH);
		System.out.println("트랙의 높이 : " + TRACK_HEIGHT);

		// TRACK_WIDTH = 100; /* error : 상수는 값을 변경할 수 없음 */ 
	}
}