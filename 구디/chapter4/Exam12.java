package chapter4;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1~100 사이의 숫자를 입력하세요\n"); 
		int a = (int) (Math.random() * 100) + 1;
		int count =0;
		while (true) {
			
			int num = scan.nextInt();
			count++;
			if (num > a) {
				System.out.println("작은 수입니다"); 
				System.out.println();
			} else if (num < a) {
				System.out.println("큰 수입니다");
				System.out.println();
			} else {
				System.out.println("정답입니다\n\n프로그램을 종료합니다");
				break;
			}
		}
        System.out.println("입력 횟수: " + count);
		System.out.println("시스템 : " + a);
	}

}
