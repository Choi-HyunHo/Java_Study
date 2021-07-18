package Toy;

public class ToyAirplane implements InterfaceToy {
	
	// 선언만 되어있는 인터페이스를 다시 재정의

	@Override
	public void walk() {
		System.out.println("The airplane can not walk.");
		
	}

	@Override
	public void run() {
		System.out.println("The airplane can not run.");
		
	}

	@Override
	public void alarm() {
		System.out.println("The airplane has alarm function.");
		
	}

	@Override
	public void light() {
		System.out.println("The airplane has no light function.");
		
	}
	
	

}
