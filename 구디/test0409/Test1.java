package test0409;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 년도를 입력받아 1월부터 12까지의 달력을 출력하는 프로그램 작성하기
 * [결과]
 * 년도를 입력하세요
 * 2024
 * 
 * 1월                 2월       3월   4월
 * 일 월 화 수 목 금 토  
 * 5월                                8월
 * 9월                               12월 
 * 
 */
public class Test1 {
	public static void main(String[] args) {
		Calendar cal =Calendar.getInstance();
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int year = scan.nextInt();
		
		for (int month = 1; month < 13; month++) {
			System.out.printf("\t%d년 %d월\n", year, month);
			System.out.printf("%3s%4s%4s%4s%3s%4s%4s\n", "일월화수목금토".split(""));
			cal.set(year, month -1, 1); 
			int start = cal.get(Calendar.DAY_OF_WEEK);

			for (int i = 1, d = 1; d <= cal.getActualMaximum(Calendar.DATE); i++) {
				if (i < start) {
					System.out.printf(" %3s", " ");
				} else {
					System.out.printf(" %3d", d++);
				}
				if (i % 7 == 0) {
					System.out.println();
				}
			}
			System.out.println("\n");
		}
		
		
		
		
	}
}