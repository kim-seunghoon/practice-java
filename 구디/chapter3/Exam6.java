package chapter3;

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("사과의 갯수를 입렵하세요");
		int amt = scan.nextInt();
		scan.close();
		System.out.println("필요한 바구니 갯수 : " + ((amt%10 == 0) ? amt/10 : amt/10 + 1) + "개");
	}
}
