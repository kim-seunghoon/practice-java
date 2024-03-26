package chapter4;

import java.util.Scanner;

/*
 * 화면에서 숫자형 문자열을 입력 받아서 각 자리수의 합을 출력하기
 */
public class Exam5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		String num = scan.next();
		int sum = 0;
		for (int i = 0; i < num.length(); i++) {
			System.out.print(num.charAt(i) + ((i == num.length()-1) ? "=" : "+"));
			sum += num.charAt(i) - '0';
		}
		System.out.println(sum);
	}

}
