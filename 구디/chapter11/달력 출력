package chapter11;

import java.util.Calendar;
import java.util.Scanner;

public class Exam9 {

	public static void main(String[] args) {
		Calendar cal =Calendar.getInstance();
		Scanner scan = new Scanner(System.in);
		System.out.println("년도와 월을 입력하세요");
		int year = scan.nextInt();
		int month = scan.nextInt();
		System.out.printf("\t%d년%d월\n", year, month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
//		System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "일월화수목금토".split(""));
		cal.set(year, month -1, 1); //입력한 월의 1일로 설정
		int start = cal.get(Calendar.DAY_OF_WEEK);
		for (int i = 1, d = 1; d <= cal.getActualMaximum(Calendar.DATE); i++) {
			if (i < start) {
				System.out.printf("%s\t", " ");
			} else {
				System.out.printf("%d\t", d++);
			}
			if (i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("---------------------");
		//2차원 배열로 달력 출력하기
		int[][] calarr = new int[6][7];
		for (int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
			//i : 날짜 값 
			cal.set(year, month -1, i);
			int week = cal.get(Calendar.DAY_OF_WEEK); //요일
			int weekcnt = cal.get(Calendar.WEEK_OF_MONTH); //월의 몇 번째 주
			calarr[weekcnt-1][week-1] = i;
		}
		System.out.printf("\t%d년%d월\n", year, month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (int i = 0; i < calarr.length; i++) {
			for (int j = 0; j < calarr[i].length; j++) {
				if (calarr[i][j] == 0) {
					System.out.printf("%s\t", " ");
				} else {
					System.out.printf("%d\t", calarr[i][j]);
				}
			}
			System.out.println();
		}
	}

}
