package chapter11;
/*
 * 년과 월을 입력하면 해당 달 첫번 째날과 마지막 날 나오게하기
 */
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Exam7 {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도와 월을 입력하세요");
		int year = scan.nextInt();
		int mon = scan.nextInt();
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		Date day = f.parse(String.format("%4d-%02d-01", year, mon));
		System.out.println(day);
		Date day2 = f.parse(String.format("%4d-%02d-01", year, mon+1));
		day2.setTime(day2.getTime() - (1000*60*60*24));
		System.out.println(day2);
		SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd E요일");
		System.out.println(f2.format(day));
		System.out.println(f2.format(day2));
	}

}
