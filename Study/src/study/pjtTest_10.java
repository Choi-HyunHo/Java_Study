package study;

public class pjtTest_10 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		// if(조건식)
		if (b > a) {
			System.out.println("b 가 a 보다 더 크다");
		}
		
		// if(조건식) else
		if (a > b) {
			System.out.println("a 가 b 보다 더 크다"); // 조건식이 True 일 경우 수행
		} else {
			System.out.println("b 가 a 보다 더 크다"); // 조건식이 False 일 경우 수행
			
		}
		
		// if(조건식) else if(조건식) 
		
		if (a > b) {
			System.out.println("a 가 b 보다 더 크다");
		} else if(a < b) {
			System.out.println("b 가 a 보다 더 크다");
		} else {
			System.out.println("a 와 b 는 같다"); // 조건식 1과 2가 False 일 경우 수행
		}
	}

}
