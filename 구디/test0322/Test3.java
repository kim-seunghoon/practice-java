package test0322;

import java.util.Scanner;

/*
 * 10진수를 2,8,10,16 진수로 변경하기
 * [결과]
10진수 값을 입력하세요
16

16의 2진수 :10000
16의 8진수 :20
16의 10진수 :16
16의 16진수 :10

*/
public class Test3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("10진수 값을 입력하세요");
		int num = scan.nextInt();
		
		int[] binary = new int[32];
		int[] octal = new int[32];
		char[] data = "0123456789ABCDEF".toCharArray();
		char[] hex = new char[8];
		int divnum1 = num, divnum2 = num, divnum3 = num;
		int index1 = 0, index2 = 0, index3 = 0;
		
		while (divnum1 > 0) {
			binary[index1++] = divnum1%2;
			divnum1 /= 2;
		}
		while (divnum2 > 0) {
			octal[index2++] = divnum2%8;
			divnum2 /= 8;
		}
		while (divnum3 > 0) {
			hex[index3++] = data[divnum3%16];
			divnum3 /= 16;
		}
		
		System.out.print(num + "의 2진수 : ");
		for (int i = index1 - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
		System.out.println();
		
		System.out.print(num + "의 8진수 : ");
		for (int i = index2 - 1; i >= 0; i--) {
			System.out.print(octal[i]);
		}
		System.out.println();
		
		System.out.println(num + "의 10진수 : " + num);
		
		System.out.print(num + "의 16진수 : ");
		for (int i = index3 - 1; i >= 0; i--) {
			System.out.print(hex[i]);
		}
		
	}
}