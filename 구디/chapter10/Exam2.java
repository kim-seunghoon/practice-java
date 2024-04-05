package chapter10;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Exam2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = 0;
		while (true) {
			try {
				num = scan.nextInt();
				for (int i = 0; i < num; i++) {
					System.out.print("*");
				}
				break;
			} catch(InputMismatchException e) {
				System.out.println("숫자만 입력하세요");
				scan.next();
			}
		}
	}
}
