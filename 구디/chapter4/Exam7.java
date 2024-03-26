package chapter4;

import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for (int i = 1; i <= num ; i++) {
			for (int j = 0; j <= num-i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
