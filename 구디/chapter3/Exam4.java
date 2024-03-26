package chapter3;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println(num + " : 양수");
		} else if (num < 0) {
			System.out.println(num + " : 음수");
		}else {
			System.out.println(0);
		}
	}

}
