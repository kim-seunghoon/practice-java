package chapter3;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("세자리 자연수를 입력하세요");
		int num = scan.nextInt();
		int a = num-num%100;
		System.out.println(a);
	}

}
