package test;

public abstract class AbstractEx {
	// 추상 클래스
	
	int num;
	String str;
	// 객체 변수
	
	public AbstractEx() {
		System.out.println("AbstractEx constructor");
	}
	// 생성자
	
	public AbstractEx(int i , String s) {
		// 매개변수가 들어옴
		System.out.println("AbstractEx constructor");
		
		this.num = i;
		this.str = s;
	}
	
	public void fun1() { 
		// 메서드
		System.out.println(" -- fun1() START --");
		
		System.out.println("num : " + num);
		System.out.println("str : " + str);
	}
	
	public abstract void fun2(); 
	// 추상 메서드
	// 상속을 받고 있는 클래스에서 구현을 한다
}
