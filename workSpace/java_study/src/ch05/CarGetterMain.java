package ch05;

public class CarGetterMain {
	public static void main(String[] args) {
		
		// [객체 생성 (디폴트 생성자 활용)]
		CarGetter car = new CarGetter();
		
		// [setter로 값 전달] 
		car.setBrand("현대");
		car.setModel("제네시스");
		car.setPrice(10000000);
		car.setColor("black");
		car.setMadeIn("한국");
		
		// [getter로 값 출력]
		car.getBrand();
		car.getModel();
		car.getPrice();
		car.getColor();
		car.getMadeIn();
		
		car.getInfo();
		
		// [객체 생성 (모든 멤버변수를 입력받는 매개변수 생성자 활용)]  
		System.out.println("== 모든 멤버변수를 입력받는 매개변수 생성자 ==");
		CarGetter car2 = new CarGetter("기아", "k8", 50000000, "스페이스 그레이", "한국");
			
		car2.getInfo();
			
	}

}
