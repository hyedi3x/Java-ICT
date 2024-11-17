package ch09_03;

public class MainDisplay {
	public static void main(String[] args) {
		// [Player 클래스형을 참조하여, Player 인스턴스를 생성] 
		// : 디폴트 생성자로 인해 BeginnerLevel이 호출된다. 
		Player player = new Player();
		player.play(1);   // run() 기능 사용
		
		// [AdvancedLevel 클래스형을 참조하여, AdvancedLevel 인스턴스를 생성] 
		AdvancedLevel alevel = new AdvancedLevel();
		player.upgradeLevel(alevel);  // AdvancedLevel으로 레벨 업
		player.play(2);   // run(), jump() 기능 사용
		
		// [SuperLevel 클래스형을 참조하여, SuperLevel 인스턴스를 생성] 
		SuperLevel slevel = new SuperLevel();
		player.upgradeLevel(slevel);  // SuperLevel으로 레벨 업
		player.play(4);   // run(), jump(), turn() 기능 사용
		
	}

}
