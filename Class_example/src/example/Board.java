package example;

public class Board {
	
	int x;
	int y;
	// 2.�ش� Ŭ������ int x, int y�� ��ü�����̹Ƿ� �������� �����͸� ������
	public Board(int x, int y) {
		// 1.�ش� �������� int x�� int y�� ���������� �޸𸮿� ��� �ִٰ� �������
		// 3.���������� int x�� int y�� ���������� ��� ������
		// 4. x = x;  y = y; ��� ǥ���� �� �ִ�.
		// ������ �����ڰ� ������ �� ȥ���� �� �����Ƿ� this Ű���带 ���
		
		this.x = x; //this.x �� ��������, x�� ��������
		this.y = y;
	
	}
	public void Info() {
		System.out.println("Info �޼��� ȣ��");
		System.out.println("x---> " + x);
		System.out.println("y---> " + y);
	}
}
