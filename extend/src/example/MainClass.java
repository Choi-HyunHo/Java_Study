package example;

public class MainClass {

	public static void main(String[] args) {
		
		ParentClass pArr[] = new ParentClass[2];

		ParentClass child = new ChildClass();
		// Child ��� ���� Ŭ������ ParentClass �ص� �������.
		// child Ŭ������ ParentClass �� ��� �ޱ� ����
		// ���� Ŭ������ Ÿ���̾ �������.
		ParentClass sch = new SecondChild();
		
		pArr[0] = child;
		pArr[1] = sch;
		
		for (int i = 0; i < pArr.length; i++) {
			pArr[i].makeRice();
		}

	}

}
