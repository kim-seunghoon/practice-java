package test0409;

import java.util.Calendar;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int year = scan.nextInt();
		Calendar cal = Calendar.getInstance();
		int[][][] calarr = new int[12][7][7];
		
		
		for (int m = 0; m < 12; m++) {
			cal.set(year, m, 1); //첫 날 설정
			int lastDay = cal.getActualMaximum(Calendar.DATE); //마지막 날 설정
			for (int i = 1; i <= lastDay; i++) {
				cal.set(year, m, i);
				int week = cal.get(Calendar.DAY_OF_WEEK);//요일 (열 값에 들어감)
				int weekcnt = cal.get(Calendar.DAY_OF_MONTH);//월의 몇 번째 주 (행 값에 들어감)
				calarr[m][weekcnt-1][week-1] = i;
			}
		}
		for (int k = 0; k < 12; k+=4) {
			for (int i = 0; i < 4; i++) {
				System.out.print("\t"+year + "년" + (k+i+1) + "월\t\t");
			}
			System.out.println();
			for (int i = 0; i < 4; i++) {
				System.out.printf("%4s%4s%4s%4s%4s%4s%4s\t", "일월화수목금토".split(""));
			}
			System.out.println();
			for (int i = 0; i < 7; i++) {
				for (int m = k; m < k+4; m++) {
					for (int j = 0; j < 7; j++) {
						if (calarr[m][i][j] == 0) {
							System.out.printf("%4c", ' ');
						} else {
							System.out.printf("%4d", calarr[m][i][j]);
						}
					}
					System.out.print("\t");
				}
				System.out.println();
			}
		}
		scan.close();
	}

}
