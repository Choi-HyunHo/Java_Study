package Toy;

public class MainClass {

	public static void main(String[] args) {
		
		InterfaceToy robot = new ToyRobot();
		InterfaceToy airplane = new ToyAirplane();
		
		InterfaceToy toys[] = {robot, airplane};
		// 같은 데이터 타입으로 통일하여 한 번에 담을 수 있다.
		
		for (int i = 0; i < toys.length; i++) {
			toys[i].walk();
			toys[i].run();
			toys[i].alarm();
			toys[i].light();
			
			System.out.println();
		}

	}

}
// 객체의 데이터 타입이 확장
// 인터페이스 부분에서 선언만하고 구현은 각 객체에서 한다.