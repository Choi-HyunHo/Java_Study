package example;

public class ChildClass {
	
	public String name;
	public String gender;
	public int age;
	public String id;
	
	public ChildClass() {
		System.out.println("-- ChildClass constructor --");
	}
	
	public void setInfo(String n, String g, int a) {  // �޼��� ����, �Ű�����(�ڷ����� ������ �̷�����) Ȱ��
		System.out.println(" -- setInfo() STRAT --");
		
		name = n;
		gender = g;
		age = a;
		
	}
	
	public void getInfo() { // �޼��� ����
		// �޼��� ����
		System.out.println(" -- getInfo() START -- ");
		System.out.println("name : " + name);
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
	}
	
	public void setInfo(String i) {
		System.out.println("id : " + i);
		id = i;
		
	}

}
