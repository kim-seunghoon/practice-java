package test0404;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 화면에서 1부터 10까지의 숫자를 입력받아서 숫자만큼 * 가로로 출력하기
 * 99숫자가 입력되면 프로그램 종료하기
 * 입력값이 숫자가 아닌 경우 : InputMismatchException 예외가 발생함
                        숫자만 입력하세요 메세지 출력하고, 다시 입력받기
   입력값이 1~10의 범위가  아닌 경우 : MyInputNumberException 예외를 발생 시키고
                        1 ~ 10까지의 숫자만 입력하세요 메세지 출력하고, 다시 입력받기 
   구동클래스와 MyInputNumberException 예외 클래스 구현하기
 */
class MyInputNumberException extends Exception {
	MyInputNumberException(String msg) {
		super(msg);
	}
}
public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = 0;
		while (true) {
			try {
				num = scan.nextInt();
				if (num == 99) {
					System.out.println("프로그램을 종료합니다");
					break;
				}
				if (num<1 || num >10) {
					throw  new MyInputNumberException("1~10사이의 숫자만 입력하세요");
				}
				for (int i = 0; i < num; i++) {
					System.out.print("*");
				}
				break;
			
			} catch(InputMismatchException e) {
				System.out.println("숫자만 입력하세요");
				scan.next();
			} catch(MyInputNumberException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
}