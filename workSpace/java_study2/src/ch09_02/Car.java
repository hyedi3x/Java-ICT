package ch09_02;

public abstract class Car {
	
	// -----[abstract method]-----
	public abstract void drive();
	public abstract void stop();
	
	// -----[concrete method]----- 
	public void startCar() {
		System.out.println("시동을 킵니다.");
	}
	
	public void downCar() {
		System.out.println("시동을 끕니다.");
	}
	
	// -----[template method]----- 
	// 메서드의 순서를 지정한 템플릿 메서드(재정의 불가)
	final public void run() {
		startCar();
		drive();
		stop();
		downCar();
		System.out.println("");
	}

}
