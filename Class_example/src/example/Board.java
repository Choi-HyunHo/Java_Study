package example;

public class Board {
	
	int x;
	int y;
	// 2.해당 클래스의 int x, int y는 객체변수이므로 전역으로 데이터를 가진다
	public Board(int x, int y) {
		// 1.해당 생성자의 int x와 int y는 지역변수라 메모리에 잠깐 있다가 사라진다
		// 3.지역변수의 int x와 int y에 전역변수를 담고 싶으면
		// 4. x = x;  y = y; 라고 표시할 수 있다.
		// 하지만 개발자가 보았을 때 혼동할 수 있으므로 this 키워드를 사용
		
		this.x = x; //this.x 는 전역변수, x는 지역변수
		this.y = y;
	
	}
	public void Info() {
		System.out.println("Info 메서드 호출");
		System.out.println("x---> " + x);
		System.out.println("y---> " + y);
	}
}
