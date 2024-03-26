package chapter4;

import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scan.nextInt();
		if (score >= 60) { //if조건문 : 조건문의 결과가 참인 경우만 {}내용실행
			System.out.println("합격입니다.");
		}
		if (score >= 60) {
			System.out.println("축하합니다");
		} else {
			System.out.println("다음 기회에");
		}
		
		if (score >= 90) System.out.println("A학점");
		 else if (score >=80) System.out.println("B학점");
		 else if (score >=70) System.out.println("C학점");
		 else if (score >=60) System.out.println("D학점");
		 else 				  System.out.println("f학점");
		
		//조건 연산자로 변경
		System.out.println((score >= 90) ? "A학점" : (score >= 80) ? "B학점" : (score >= 70) ? "C학점" : (score >= 60) ? "D학점" : "F학점" );
	}

}
