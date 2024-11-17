package ch09_03;

// [추상 클래스(PlayerLevel)]
// : 추상 메서드 run( ), jump( ) ,turn( ), showLevelMessage( )
public abstract class PlayerLevel {
	String ERROR = "아직 기능을 사용할 수 없습니다.";
	
	// ---- {추상 메서드} ----
	public abstract void run(int count);
	public abstract void jump(int count);
	public abstract void turn(int count);
	public abstract void showLevelMessage();
	
	//---- {템플릿 메서드} ----
	final public void go(int count) {
		run(count);
		jump(count);
		turn(count);
		System.out.println();
	}
}
