package example;

public class ChildClass extends ParentClass {
	// ChildClass �� ParentClass�� ��� �޴´�
	// ChildClass �� ParentClass �� ����� �̿� ����
	public ChildClass() {
		System.out.println("ChildClass constructor");
	}
	
	@Override
	public void makeRice() {
		System.out.println("-- more makeRice --");
	}

}
