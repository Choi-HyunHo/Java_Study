package test;

public class Interfaceclass implements InterfaceA, InterfaceB {
	// �������̽��� ����� �� implements ���
	// ��Ӱ� �ٸ��� �������� ����
	
	public Interfaceclass() {
		System.out.println(" -- Interfaceclass constructors --");
	}

	
	@Override
	public void funA() {
		System.out.println("-- funA() --");
		
	} 
	
	@Override
	public void funB() {
		System.out.println("-- funB() --");
		
	}

	

}
