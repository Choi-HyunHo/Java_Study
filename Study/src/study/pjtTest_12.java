package study;

import java.util.Scanner;

public class pjtTest_12 {


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("INPUT NUMBER : ");
		int inputnum = scanner.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", inputnum, i, (inputnum * i));
			
		}

	}

}
