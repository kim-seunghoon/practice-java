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
		int divnum2 = num, divnum8 = num, divnum16 = num;
		int index = 0;
		int [] binary = new int[32];
		int [] octal = new int[32];
		char [] data = "0123456789ABCDEF".toCharArray();
		char [] hex = new char[8];
		
		//2진수 
		while (divnum2 > 0) {
			binary[index++] = divnum2%2;
			divnum2 /= 2;
		}
		System.out.print("\n" + num + "의 2진수 : ");
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
		
		index = 0; 
		//8진수
		while (divnum8 > 0) {
			octal[index++] = divnum8%8;
			divnum8 /= 8;
		}
		System.out.print("\n" + num + "의 8진수 : ");
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(octal[i]);
		}
		
		//10진수
		System.out.print("\n" + num + "의 10진수 : " + num);
		
		index = 0;
		//16진수
		while (divnum16 > 0) {
			hex[index++] = data[divnum16%16];
			divnum16 /= 16;
		}
		System.out.print("\n" + num + "의 16진수 : ");
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(hex[i]);
		}
	}
}