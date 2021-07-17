package example;

public class ParentClass {
	
	public ParentClass() { // 부모 클래스의 생성자가 먼저 실행
		System.out.println("ParentClass constructor");
	}
	
	public void ParentFun() {
		System.out.println("ParentFun()");
	}
	
	/*private void privateFun() {
		System.out.println("privateFun()");
	}*/
	
	// 자식 클래스는 부모 클래스의 모든 자원을 사용할 수 있지만, private접근자의
	// 속성과 메서드는 이용할 수 없다.
}
