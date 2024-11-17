package ch05;

public class CarGetter {
	// [멤버변수] 
	private String brand;
	private String model;
	private int price;
	private String color;
	private String madeIn;
	
	// ----------------------
	/* 
	  [생성자]
	  - new에 의해 호출된다. 클래스이름과 같고, 반환값이 없다.
    
    [기본생성자(디폴트생성자)]
    - 인스턴스 생성시점에 호출 
    - 생성자가 하나도 없을때 자바 컴파일러가 자동추가
    
    [매개변수 생성자]
    - 매개변수 생성자가 존재시 컴파일러가 디폴트생성자를 자동추가하지 않으므로, 개발자가 추가하지 않으면 컴파일 오류 발생
	 */
	
	// [디폴트 생성자]  
	public CarGetter() {}
	
	// [매개변수 생성자]  
	// 모든 멤버 변수를 입력받는 생성자 생성 (모든 매개변수를 설정안해도 괜찮음)
	public CarGetter(String brand, String model, int price, String color, String madeIn) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.color = color;
		this.madeIn = madeIn;
	}
	
	//------[멤버 메서드]-----------
	// [get(), set()메서드]
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}
	
	public String getMadeIn() {
		return madeIn;
	}
	
	// [출력을 담당하는 메서드 생성]
	public void getInfo() {
		System.out.println("좋아하는 차 브랜드 : " + brand);
		System.out.println("좋아하는 차 종류 : " + model);
		System.out.println("좋아하는 차 가격 : " + price);
		System.out.println("좋아하는 차 색상 : " + color);
		System.out.println("좋아하는 차 제조국가 : " + madeIn);
		System.out.println("");
	}

}
