package chapter4;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		System.out.println("삼각형의 높이 : " + h);	
		int b = h * 2 - 1;
		int m = b/2;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j <= m + i; j++) {
				if (j >= m - i && j <= m + i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
