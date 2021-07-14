package study;

public class pjtTest_3 {

	public static void main(String[] args) {
		
		// 서식문자
		System.out.println("오늘의 기온은 10도 입니다.");
		System.out.printf("오늘의 기온은 %d도 입니다.\n", 10);
		
		int num1 = 20;
		System.out.println("오늘의 기온은 " + num1 + "도 입니다.");
		System.out.printf("오늘의 기온은 %d도 입니다.\n", num1);
		
		// 정수
		int num2 = 30;
		System.out.printf("num2(10진수) : %d\n", num2);
		System.out.printf("num2(8진수) : %o\n", num2);
		System.out.printf("num2(16진수) : %x\n", num2);
		
		// 문자
		System.out.printf("소문자 %c\n", 'a');
		
		// 실수
		float f = 1.23f;
		System.out.printf("f = %f\n", f);
		
	}

}
