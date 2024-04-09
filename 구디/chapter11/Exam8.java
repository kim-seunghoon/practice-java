package chapter11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * 년도와 월을 입력 받아서 년월의 첫 번째 일자와 마지막 일자의 요일 출력하기
 */
public class Exam8 {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도와 월을 입력하세요");
		int year = scan.nextInt();
		int month = scan.nextInt();
		Calendar d = Calendar.getInstance();
		d.set(year, month-1, 1);
		String w = " 일월화수목금토";
		System.out.printf("날짜 : %d-%02d-%02d %c요일\n", d.get(Calendar.YEAR), d.get(Calendar.MONTH)+1, d.get(Calendar.DATE), w.charAt(d.get(Calendar.DAY_OF_WEEK)));
		int d2 =  d.getActualMaximum(Calendar.DATE);
		d.set(year, month-1, d2);
		System.out.printf("날짜 : %d-%02d-%02d %c요일\n", d.get(Calendar.YEAR), d.get(Calendar.MONTH)+1, d.get(Calendar.DATE), w.charAt(d.get(Calendar.DAY_OF_WEEK)));
	
	}

}
