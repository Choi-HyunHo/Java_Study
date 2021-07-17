package example;

public class MainClass {

	public static void main(String[] args) {

		ChildClass child = new ChildClass();
		child.ChildFun();
		child.ParentFun();
		
		//child.privateFun(); // 이용 불가능

	}

}
