package test;

public class ClassEx extends AbstractEx {
		
	public ClassEx() {
		System.out.println("ClassEx constructor");
	}
	
	public ClassEx(int i, String s) { 
		// �Ű� ������ ����
		super(i, s); 
		// ���� Ŭ������ �÷� ������
		// AbstractEx Ŭ������ ��
	}
	
	@Override // ����
	public void fun2() {
		System.out.println(" -- fun2() STRAT --");
	}

}
