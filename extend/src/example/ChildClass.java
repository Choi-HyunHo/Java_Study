package example;

public class ChildClass extends ParentClass {
	// ChildClass 가 ParentClass를 상속 받는다
	// ChildClass 는 ParentClass 의 기능을 이용 가능
	public ChildClass() {
		System.out.println("ChildClass constructor");
	}
	
	@Override
	public void makeRice() {
		System.out.println("-- more makeRice --");
	}

}
