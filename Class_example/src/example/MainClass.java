package example;

public class MainClass {

	public static void main(String[] args) {
		
		Audi Car = new Audi(); // Car ��ü�� �����Ѵ�.
		
		Car.color = "red"; // ��ü : 'Car' , ��ü���� : 'color'
		// Car ��ü�� ��ü ���� color�� red�� �����Ѵ�.
		// ��, Audi Ŭ������ color�� red�� �����Ѵ�.
		Car.gear = "auto";
		Car.price = 10000000;
		
		
		Car.run(); // Audi �� run �޼��� ȣ��
		Car.stop();
		Car.info();

	}

}
