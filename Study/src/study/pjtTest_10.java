package study;

public class pjtTest_10 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		// if(���ǽ�)
		if (b > a) {
			System.out.println("b �� a ���� �� ũ��");
		}
		
		// if(���ǽ�) else
		if (a > b) {
			System.out.println("a �� b ���� �� ũ��"); // ���ǽ��� True �� ��� ����
		} else {
			System.out.println("b �� a ���� �� ũ��"); // ���ǽ��� False �� ��� ����
			
		}
		
		// if(���ǽ�) else if(���ǽ�) 
		
		if (a > b) {
			System.out.println("a �� b ���� �� ũ��");
		} else if(a < b) {
			System.out.println("b �� a ���� �� ũ��");
		} else {
			System.out.println("a �� b �� ����"); // ���ǽ� 1�� 2�� False �� ��� ����
		}
	}

}
