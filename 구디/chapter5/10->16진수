package chapter5;

import java.util.Scanner;

public class ArrEx5 {

	public static void main(String[] args) {
		//10진수를 16진수로 변환하기
		char[] data = "0123456789ABCDEF".toCharArray();
		char[] hex = new char[8];
		System.out.println("16진수로 변환할 10진수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num;
		int index = 0;
		while (divnum > 0) {
			hex[index++] = data[divnum%16];
			divnum /= 16;
		}
		System.out.print(num + "의 16진수 : ");
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(hex[i]);
		}
		System.out.println();
		System.out.println(Integer.toHexString(num));
	}

}
