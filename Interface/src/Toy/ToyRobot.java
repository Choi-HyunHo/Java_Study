package Toy;

public class ToyRobot implements InterfaceToy {

	@Override
	public void walk() {
		System.out.println("The robot can not walk.");
		
	}

	@Override
	public void run() {
		System.out.println("The robot can run.");
		
	}

	@Override
	public void alarm() {
		System.out.println("The robot has no alarm function.");
		
	}

	@Override
	public void light() {
		System.out.println("The robot has light function.");
		
	}

}
