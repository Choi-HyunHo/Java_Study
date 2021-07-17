package example;

public class MainClass_3 {

	public static void main(String[] args) {
		
		ChildClass child1 = new ChildClass(); // 객체 생성
		child1.setInfo("Choi hyun ho", "m", 25);
		// 메서드 호출
		// ChildClass의 객체 변수에 값을 대입
		
		child1.getInfo(); // 메서드 호출
		child1.setInfo("x7788");

	}

}
