package ch09_03;

// [Player 클래스: PlayerLevel 추상 클래스와 포함(HAS-A 관계) 관계]
public class Player {
	// ----- {멤버 변수} ----- 
	// : PlayerLevel 클래스형으로 level 변수 선언
	private PlayerLevel level;
	
	// ----- {디폴트 생성자 : 처음 생성시 출력} -----
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	// ----- {멤버 메서드} -----
	// [getLevel 메서드 생성 : 반환타입(PlayerLevel 클래스)]
	public PlayerLevel getLevel() {
		return level;
	}
	
	// [레벨 변경 메서드]
	// : 자신의 level을 매개변수로 받아, level 변경
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	// [play 메서드 : play 횟수] 
	public void play(int count) {
		level.go(count);   // 템플릿 메서드 호출
	}

}
