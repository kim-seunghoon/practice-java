package chapter4;

import java.util.Scanner;

public class LoopEx8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1~100 사이의 숫자를 입력하세요\n"); 
		int num = scan.nextInt();
		int a = (int) (Math.random() * 100) + 1;
		do {
			num = scan.nextInt();
			if (num > a) {
				System.out.println("작은 수입니다"); 
				System.out.println();
			} else if (num < a) {
				System.out.println("큰 수입니다");
				System.out.println();
			}
		} while(num != a);
		System.out.println("정답입니다\n프로그램 종료");
		System.out.println("시스템 : " + a);
	}

}
