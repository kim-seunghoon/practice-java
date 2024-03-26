package chapter3;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		System.out.println("x = " + x++);
		System.out.println("x = " + --x);
		//화면에서 정수를 입력받아 x=입력 받은 수로 나오도록 코딩하기
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		x = scan.nextInt();
		System.out.println("x = " + x++);
		System.out.println("x = " + --x);
	}
}
