package chapter4;

import java.util.Scanner;

/*
 * 정수로 입력받아서 각 자릿수의 합을 출력
 */
public class LoopEx3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		int sum = 0;
		while (num > 0) {
			sum += num%10;
			num /= 10;
		}
		System.out.print("자릿수의 합 : " + sum);
	}

}
