package map;

import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {
		
		// HashMap ��ü ����
		HashMap<Integer, String> map = new HashMap<Integer, String>();  // Ű, ���� ��
		System.out.println("map.size() : " + map.size());
			
		// ������ �߰�
		map.put(5, "Hello");
		map.put(6, "Java");
		map.put(7, "World");
		System.out.println("map : " + map);
		System.out.println("map.size() : " + map.size());  // 3���� �����Ͱ� ����־� ũ��� 3
				
		map.put(8, "!!");
		System.out.println("map : " + map);
				
		// ������ ��ü
		map.put(6, "C");
		System.out.println("map : " + map);
				
		// ������ ����
		String str = map.get(5);
		System.out.println("map.get(5) : " + str);
				
		// ������ ����
		map.remove(8);
		System.out.println("map : " + map);
				
		// Ư�� ������ ���� ����
		boolean b = map.containsKey(7);
		System.out.println("map.containsKey(7) : " + b);
				
		b = map.containsValue("World");
		System.out.println("map.containsValue(\"World\") : " + b);
				
		// ������ ��ü ����
		map.clear();
		System.out.println("map : " + map);
				
		// ������ ����
		b = map.isEmpty();
		System.out.println("map.isEmpty() : " + b);
			}
			

	}

