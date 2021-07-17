package example;

public class ParentClass {
	
	int Year = 1995;
	
	public ParentClass() { // 부모 클래스의 생성자가 먼저 실행
		System.out.println("ParentClass constructor");
	}
	
	public void OpenYear() {
		System.out.println("-- OpenYear --");
	}
}
