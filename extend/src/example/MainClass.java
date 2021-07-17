package example;

public class MainClass {

	public static void main(String[] args) {
		
		ParentClass pArr[] = new ParentClass[2];

		ParentClass child = new ChildClass();
		// Child 대신 상위 클래스인 ParentClass 해도 상관없다.
		// child 클래스는 ParentClass 를 상속 받기 때문
		// 상위 클래스의 타입이어도 상관없다.
		ParentClass sch = new SecondChild();
		
		pArr[0] = child;
		pArr[1] = sch;
		
		for (int i = 0; i < pArr.length; i++) {
			pArr[i].makeRice();
		}

	}

}
