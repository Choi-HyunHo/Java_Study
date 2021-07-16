package example;

public class MainClass {

	public static void main(String[] args) {
		
		Audi Car = new Audi(); // Car 객체를 생성한다.
		
		Car.color = "red"; // 객체 : 'Car' , 객체변수 : 'color'
		// Car 객체의 객체 변수 color에 red를 대입한다.
		// 즉, Audi 클래스의 color에 red를 대입한다.
		Car.gear = "auto";
		Car.price = 10000000;
		
		
		Car.run(); // Audi 의 run 메서드 호출
		Car.stop();
		Car.info();

	}

}
