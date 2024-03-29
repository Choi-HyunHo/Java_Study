package list;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		// ArrayList 객체 생성
		ArrayList<String> list = new ArrayList<String>();
				
		System.out.println("list.size : " + list.size());
				
		// 데이터 추가
		list.add("Hello");
		list.add("Java");
		list.add("World");
		System.out.println("list.size : " + list.size());
		System.out.println("list : " + list);
				
		list.add(2, "Programing");	// 추가
		System.out.println("list : " + list);
				
		list.set(1, "C");			// 변경
		System.out.println("list : " + list);
				
		// 데이터 추출
		String str = list.get(2);
		System.out.println("list.get(2) : " + str);
		System.out.println("list : " + list);
				
		// 데이터 제거
		str = list.remove(2);
		System.out.println("list.remove(2) : " + str);
		System.out.println("list : " + list);
				
		// 데이터 전체 제거
		list.clear();
		System.out.println("list : " + list);
				
		// 데이터 유무
		boolean b = list.isEmpty();
		System.out.println("list.isEmpty() : " + b);

	}

}
