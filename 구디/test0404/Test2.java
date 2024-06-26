package test0404;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
1부터 100까지 중 임의의 숫자를 컴퓨터가 저장하고,값을 입력받아 저장된 값을 맞추는 프로그램을 작성하기
  1 부터 100까지의 숫자가 아닌 경우 : 1 과 100사이의 숫자만 입력하세요 메세지출력. 
                              MyInputNumberException 클래스로 예외발생시킴 
  숫자가 입력이 안된 경우 :  숫자만 입력하세요  메세지 출력
  
  숫자를 맞출때 까지 계속 입력을 받는다.
  
  몇번의 입력만에 숫자를 맞추었는지 출력하기.
  단 입력 오류된 입력도 입력 건수에 포함된다.

1. 임의의 수를 저장
2. 반복문으로 데이터 입력 받기. 큰수,작은수 출력
   정답과 비교
3. 입력횟수 증가         
*/
class MyInputNumberException extends Exception {
	MyInputNumberException(String msg) {
		super(msg);
	}
}
public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1~100사이의 숫자를 입력하세요\n");
		int a = (int)(Math.random() * 100) + 1;
		int count = 0;
		while (true) {
			try {
				int num = scan.nextInt();
				count++;
				if (num < 1 || num > 100) {
					throw new MyInputNumberException("1~100사이의 숫자만 입력하세요");
				}
				if (num > a) {
					System.out.println("작은 수입니다\n");
				} else if (num < a) {
					System.out.println("큰 수입니다\n");
				} else {
					System.out.println("정답입니다\n프로그램을 종료합니다");
					break;
				}
			} catch(InputMismatchException e) {
				count ++;
				System.out.println("숫자만 입력하세요");
				scan.next();
			} catch(MyInputNumberException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("입력 횟수 : " + count);
		System.out.println("정답 : " + a);
	}
}