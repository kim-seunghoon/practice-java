package chapter4;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = scan.nextInt();
		System.out.println("------------");
		System.out.println("num : " + num);
		if (num > 0 && num%2 == 0) {
			System.out.println("양수\n짝수");
		} else if (num > 0 && num%2 == 1) {
			System.out.println("양수\n홀수");
		} else if (num < 0 && num%2 == 0) {
			System.out.println("음수\n짝수");
		} else if (num < 0 && num%2 == -1) {
			System.out.println("음수\n홀수");
		} else if (num == 0) {
			System.out.println("0");
		}
	}

}
