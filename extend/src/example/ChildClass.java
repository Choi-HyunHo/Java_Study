package example;

public class ChildClass extends ParentClass {
	// ChildClass �� ParentClass�� ��� �޴´�
	// ChildClass �� ParentClass �� ����� �̿� ����
	
	int Year = 2000;
	
	public ChildClass() {
		System.out.println("ChildClass constructor");
	}
	
	@Override
	public void OpenYear() {
		System.out.println("ChildClass Open year : " + this.Year);
		System.out.println("Parent Open year : " + super.Year); // ���� Ŭ������ ȣ���� �� super Ű���带 ���
	}
	

}
