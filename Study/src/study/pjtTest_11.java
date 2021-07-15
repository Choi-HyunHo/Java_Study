package study;

import java.util.Scanner;

public class pjtTest_11 {

	public static void main(String[] args) {
		
		System.out.println("점수를 입력하세요 : ");
		
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		// switch 문
		switch (score) {
			case 100:
			case 90:
				System.out.println("학점 : A");
				break;
		
			case 80:
				System.out.println("학점 : B");
				break;
		
			case 70:
				System.out.println("학점 : C");
				break;
		
			default:
				System.out.println("재수강 입니다.");
		}
	scanner.close();
	
	}

}