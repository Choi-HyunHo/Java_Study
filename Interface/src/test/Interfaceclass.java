package test;

public class Interfaceclass implements InterfaceA, InterfaceB {
	// 인터페이스를 사용할 때 implements 사용
	// 상속과 다르게 다중으로 가능
	
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
