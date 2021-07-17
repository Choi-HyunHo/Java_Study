package example;

public class ChildClass extends ParentClass {
	// ChildClass 가 ParentClass를 상속 받는다
	// ChildClass 는 ParentClass 의 기능을 이용 가능
	
	int Year = 2000;
	
	public ChildClass() {
		System.out.println("ChildClass constructor");
	}
	
	@Override
	public void OpenYear() {
		System.out.println("ChildClass Open year : " + this.Year);
		System.out.println("Parent Open year : " + super.Year); // 상위 클래스를 호출할 때 super 키워드를 사용
	}
	

}
