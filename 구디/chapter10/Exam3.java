package chapter10;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Exam3 {
	public static void main(String[] args) throws Exception  {
		Scanner scan = new Scanner(System.in);
		System.out.println("1~10 사이의 숫자를 입력하세요");
		int num = 0;
		while (true) {
			try {
			num = scan.nextInt();
//			if (num<1 || num>10) {
//				throw new Exception("1~10사이의 숫자만 입려하세요");
//			}
			if (num>=1 && num<=10) {
				for (int i = 0; i < num; i++) {
					System.out.print("*");
				}
				break;		
			} else {
				throw new Exception();
				
			}
			} catch(InputMismatchException e) {
				System.out.println("숫자만 입력하세요");
				scan.next();
			} catch(Exception e) {
				System.out.println("1~10 사이의 숫자만 가능합니다");
//				System.out.println(e.getMessage());
			}
			
		}
	}
}
