package ch04;

// [if - else if - else문]
public class _04_ElseIF {
  public static void main(String[] args) {
    System.out.println("num이 \"양수\"인지, \"음수\"인지 \"0\"인지 출력");
     // int num = -5;
     // int num = 0;
     int num = 7;
	
     if(num > 0) {
       System.out.println("양수");
     }
	
     else if(num < 0) {
       System.out.println("음수");
     }

     else {
       System.out.println("0");
     }
  }
}