package test0321;


import java.util.Scanner;
/*

삼각형의 높이를 홀수로 입력하세요
5
*****
 ***
  *
 ***
*****


 */
public class Test6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("삼각형의 높이를 홀수로 입력하세요");
		int num = scan.nextInt();
		int num2 = 0;
		
		num = (num%2 == 0) ? num -1 : num;
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < (num - num2); j++) {
				System.out.print((j >= num2) ? "*" : " ");
			}
			num2 = i < (num/2) ? num2 + 1 : num2 -1;
			System.out.println();
		}
	}
}