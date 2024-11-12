package ch06;

// [Bus, Subway, Student 클래스 협력]
public class TakeTrans {
	public static void main(String[] args) {
		// [학생 객체 생성] 
		Student st1 = new Student("James", 5000);  // 학생1
		Student st2 = new Student("Tomas", 10000); // 학생 2
		
		// [학생1 버스 탑승]
		Bus bus80 = new Bus(80);  // 80번 버스 객체 생성
		st1.takeBus(bus80);    // 80번 버스 탑승
		st1.showInfo();        // 학생 정보 출력 (James)
		bus80.showInfo();      // 버스 정보 출력 
		System.out.println("");

		// [학생2 지하철 탑승]
		Subway sub3 = new Subway("3호선");  // 3호선 지하철 객체 생성
		st2.takeSubway(sub3);  // 3호선 탑승
		st2.showInfo();        // 학생 정보 출력 (Tomas)
		sub3.showInfo();      // 지하철 정보 출력 
		System.out.println("");
	}
}
