package ch05;

// [setter를 활용하여, 계산기 클래스 생성] 
public class CalculatorSetter {
  private double num1;
  private double num2;
  
  // [setNumbers : num1, num2 값을 받아오는 함수 생성]
  public void setNumbers(double num1, double num2) {
     this.num1 = num1;
     this.num2 = num2;
  }
  
  // [setAdd : num1, num2 값을 더하는 함수] 
	public double setAdd(double n1, double n2) {
		double result = n1 + n2;
		return result;
	}
	
  // [setSub : num1, num2 값을 빼는 함수] 
	public double setSub(double n1, double n2) {
		double result = n1 - n2;
		return result;
	}
	
  // [setMul : num1, num2 값을 곱하는 함수] 
	public double setMul(double n1, double n2) {
		double result = n1 * n2;
		return result;
	}
	
	// [setDiv : num1, num2 값을 나누는 함수] 
	public double setDiv(double n1, double n2) {
		double result = n1 / n2;
		return result;
	}
	
	// [출력메서드]
	public void PrintInfo() {
		double add = setAdd(num1, num2);
		double sub = setSub(num1, num2);
		double mul = setMul(num1, num2);
		double div = setDiv(num1, num2);
		  
		System.out.println("add " + add);
		System.out.println("sub : " + sub);
		System.out.println("mul : " + mul);
		System.out.println("div : " + div);
		
	}
	
}
