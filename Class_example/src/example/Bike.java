package example;

public class Bike {
	
	public String color; // ��ü ����
	public String gear;
	
	public Bike() {
		System.out.println("Bike"); // ������
	}
	
	public Bike(String c, String g) {
	// �����ڿ��� �Ķ���� ���� �޾Ƽ� ����� �� �ִ�.
	color = c;
	gear = g;
	}
	
	public void info() {
		System.out.println("--info--");
		System.out.println("color = " + color);
		System.out.println("gear = " + gear);
	}
}

