package test0321;


import java.util.Scanner;

/*
삼각형의 높이를 입력하세요
3
*****
 ***
  *
 
 */
public class Test5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요");
		int h = scan.nextInt();
		for (int i = h; i > 0; i--) {
			for (int j = h - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = i * 2 - 1; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}