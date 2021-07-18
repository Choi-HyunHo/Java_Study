package Toy;

public class MainClass {

	public static void main(String[] args) {
		
		InterfaceToy robot = new ToyRobot();
		InterfaceToy airplane = new ToyAirplane();
		
		InterfaceToy toys[] = {robot, airplane};
		// ���� ������ Ÿ������ �����Ͽ� �� ���� ���� �� �ִ�.
		
		for (int i = 0; i < toys.length; i++) {
			toys[i].walk();
			toys[i].run();
			toys[i].alarm();
			toys[i].light();
			
			System.out.println();
		}

	}

}
// ��ü�� ������ Ÿ���� Ȯ��
// �������̽� �κп��� �����ϰ� ������ �� ��ü���� �Ѵ�.