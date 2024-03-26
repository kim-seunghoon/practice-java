package test0319;

import java.util.Scanner;

//  반지름을 입력받아 원의 둘레와 면적을 소숫점이하 2자리로 출력하기
public class Test6 {
	public static void main(String[] args) {
		double pi = 3.141592;
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		System.out.println("반지름의 길이 : " + r);
		System.out.printf("원의 둘레 : %.2f\n",  r * 2 * pi);
		System.out.printf("원의 넓이 : %.2f",  r * r * pi);
	}
}
