package ch07;

// [과목에 대한 클래스] 
public class Subject {
	// [멤버 변수]
	private String name;   // 과목 이름
	private int score;     // 과목 점수
	
	// [get, set 메서드]
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}

}
