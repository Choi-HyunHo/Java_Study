package test;

public abstract class AbstractEx {
	// �߻� Ŭ����
	
	int num;
	String str;
	// ��ü ����
	
	public AbstractEx() {
		System.out.println("AbstractEx constructor");
	}
	// ������
	
	public AbstractEx(int i , String s) {
		// �Ű������� ����
		System.out.println("AbstractEx constructor");
		
		this.num = i;
		this.str = s;
	}
	
	public void fun1() { 
		// �޼���
		System.out.println(" -- fun1() START --");
		
		System.out.println("num : " + num);
		System.out.println("str : " + str);
	}
	
	public abstract void fun2(); 
	// �߻� �޼���
	// ����� �ް� �ִ� Ŭ�������� ������ �Ѵ�
}
