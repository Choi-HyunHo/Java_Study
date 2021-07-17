package example;

public class SecondChild extends ParentClass {
	
	public SecondChild() {
		System.out.println("SecondChild constructor");
	}
	
	@Override
	public void makeRice() {
		System.out.println("-- more more makeRice --");
	}

}
