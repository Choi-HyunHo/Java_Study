package example;

public class MainClass_4 {

	public static void main(String[] args) {
		
		ObjectClass obj1 = new ObjectClass();
		ObjectClass obj2 = new ObjectClass();
		ObjectClass obj3 = new ObjectClass();
		
		if(obj1 == obj2) {
			System.out.println("obj1 == obj2");
		} else {
			System.out.println("obj1 != obj2");
		}
		
		if(obj2 == obj3) {
			System.out.println("obj2 == obj3");
		} else {
			System.out.println("obj2 != obj3");
		}
		
		if(obj1 == obj3) {
			System.out.println("obj1 == obj3");
		} else {
			System.out.println("obj1 != obj3");
		}
		

	}

}
