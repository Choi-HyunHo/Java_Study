package example;

public class Audi {

	public static Audi myCar;
	
		public String color;
		public String gear;
		public int price;
		// 객체 변수 생성
		
		public Audi() {
			System.out.println("Audi constructor"); // 생성자, 해당 클래스에서 가장 먼저 실행되는 부분
			
		}
		
		public void run() {
			// 메서드, 해당 클래스의 기능
			// run 메서드가 실행되면 내부의 기능들이 실행된다.
			// public : 접근 제어자, void : 반환 값이 없다. 
			System.out.println("--run--");
		}
		
		public void stop() {
			System.out.println("--stop--");
		}
		
		public void info() {
			System.out.println("car color : " + color);
			System.out.println("car gear : " + gear);
			System.out.println("car price : " + price);	
		}
	}
