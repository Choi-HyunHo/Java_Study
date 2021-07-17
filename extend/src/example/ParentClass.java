package example;

public class ParentClass {
	
	public ParentClass() { // 부모 클래스의 생성자가 먼저 실행
		System.out.println("ParentClass constructor");
	}
	
	public void makeRice() {
		System.out.println("-- makeRice() --");
	}
}
