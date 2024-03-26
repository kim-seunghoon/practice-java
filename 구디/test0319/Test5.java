package test0319;

import java.util.Scanner;

/*
 * 밑변과 높이를 입력받아 삼각형의 넓이를 출력하기. 소숫점을 표시
 * [결과]
 * 밑변의 길이
 * 10
 * 높이의 길이
 * 20
 * 
 * 넓이=10*20 / 2
 */
public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l1 = sc.nextInt();
		int l2 = sc.nextInt();
		System.out.println("밑변의 길이\n" + l1);
		System.out.println("높이의 길이\n" + l2);
		System.out.println();
		double result = (double)(l1 * l2) / 2;
		System.out.println("넓이 = " + result);
	}
}
