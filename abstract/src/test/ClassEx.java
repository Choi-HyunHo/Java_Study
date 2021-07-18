package test;

public class ClassEx extends AbstractEx {
		
	public ClassEx() {
		System.out.println("ClassEx constructor");
	}
	
	public ClassEx(int i, String s) { 
		// 매개 변수가 들어옴
		super(i, s); 
		// 상위 클래스로 올려 보낸다
		// AbstractEx 클래스로 들어감
	}
	
	@Override // 구현
	public void fun2() {
		System.out.println(" -- fun2() STRAT --");
	}

}
