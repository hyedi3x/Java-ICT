package ch05;

public class CalSetterMain {

	public static void main(String[] args) {
		// [객체 생성] 
		CalculatorSetter cal = new CalculatorSetter();
		
		// [num1, num2 값 대입] 
		cal.setNumbers(8.0, 4.0);
		
		cal.PrintInfo();
		
	}
	
}
