package example;

public class Audi {

	public static Audi myCar;
	
		public String color;
		public String gear;
		public int price;
		// ��ü ���� ����
		
		public Audi() {
			System.out.println("Audi constructor"); // ������, �ش� Ŭ�������� ���� ���� ����Ǵ� �κ�
			
		}
		
		public void run() {
			// �޼���, �ش� Ŭ������ ���
			// run �޼��尡 ����Ǹ� ������ ��ɵ��� ����ȴ�.
			// public : ���� ������, void : ��ȯ ���� ����. 
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
