package study;

import java.util.Scanner;

public class pjtTest_13 {

	public static void main(String[] args) {
	
				
				Scanner scanner = new Scanner(System.in);
				System.out.println("INPUT NUMBER : ");
				int inputnum = scanner.nextInt();
				int i = 1;
				
				while(i < 10) {
					System.out.printf("%d * %d = %d\n", inputnum, i, (inputnum * i));
					i++;
				}

			}

		}