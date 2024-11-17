package ch09_03;

// [중급자 클래스 : PlayerLevel의 자식 클래스]
public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run(int count) {
		System.out.println("run : 빨리 " + count + "번 달립니다.");
	}

	@Override
	public void jump(int count) {
		System.out.println("jump: 높이 " + count + "번 뜁니다.");		
	}

	@Override
	public void turn(int count) {
		System.out.println("turn: " + ERROR);		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("-------중급자 레벨입니다.--------");
	}

}
