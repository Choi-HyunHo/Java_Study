package example;

public class ParentClass {
	
	public ParentClass() { // �θ� Ŭ������ �����ڰ� ���� ����
		System.out.println("ParentClass constructor");
	}
	
	public void ParentFun() {
		System.out.println("ParentFun()");
	}
	
	/*private void privateFun() {
		System.out.println("privateFun()");
	}*/
	
	// �ڽ� Ŭ������ �θ� Ŭ������ ��� �ڿ��� ����� �� ������, private��������
	// �Ӽ��� �޼���� �̿��� �� ����.
}
