package example;

public class Bike {
	
	public String color; // 객체 변수
	public String gear;
	
	public Bike() {
		System.out.println("Bike"); // 생성자
	}
	
	public Bike(String c, String g) {
	// 생성자에서 파라미터 값을 받아서 사용할 수 있다.
	color = c;
	gear = g;
	}
	
	public void info() {
		System.out.println("--info--");
		System.out.println("color = " + color);
		System.out.println("gear = " + gear);
	}
}

