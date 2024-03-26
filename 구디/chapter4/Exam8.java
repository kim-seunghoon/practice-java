package chapter4;

import java.util.Scanner;

public class Exam8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for (int i = 1; i <= num ; i++) {
			for (int j = num - 1; j >= i ; j--) {
				System.out.print(" ");
			}	
			for (int j2 = 1; j2 <= i ; j2++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
