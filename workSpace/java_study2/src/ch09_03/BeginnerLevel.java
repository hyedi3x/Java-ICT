package ch09_03;

// [초보자 클래스 : PlayerLevel의 자식 클래스]
public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run(int count) {
		System.out.println("run : 천천히 " + count + "번 달립니다.");
	}

	@Override
	public void jump(int count) {
		System.out.println("jump: " + ERROR);		
	}

	@Override
	public void turn(int count) {
		System.out.println("turn: " + ERROR);		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("-------초보자 레벨입니다.--------");
	}

}
