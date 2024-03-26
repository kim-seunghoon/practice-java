package chapter4;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자들을 입력하세요");
		int sum = 0;
		while (true) {
			int num = scan.nextInt();
			if (num == 999) {
				break;
			}
			sum += num;
		}
		System.out.println("입력한 수의 합 : " + sum);
		
	}

}
