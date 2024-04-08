package test0408;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
/*
 * 두개의 날짜를 입력받아서 두날짜사이의 일수를 출력하기
  [결과]
첫번째 날짜를 입력하세요(yyyy-MM-dd)
2024-01-01
두번째 날짜를 입력하세요(yyyy-MM-dd)
2024-01-03
2024-01-03 -2024-01-01 일자의 차이 : 2  
 */
public class Test3 {
	public static void main(String[] args) throws ParseException {
		Scanner scan =new Scanner(System.in);
		System.out.println("첫 번째 날짜를 입력하세요(yyyy-MM-dd)");
		String fd = scan.nextLine();
		System.out.println("두 번째 날짜를 입력하세요(yyyy-MM-dd)");
		String sd = scan.nextLine();
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		Date day1 = f.parse(fd);
//		System.out.print(new SimpleDateFormat("yyyy-MM-dd").format(day1));
		Date day2 = f.parse(sd);
//		System.out.print(new SimpleDateFormat("yyyy-MM-dd").format(day2));
		long cha= (day1.getTime()-day2.getTime()) / (1000*60*60*24);
		System.out.printf("%s - %s 일자의 차이 : %d", fd, sd, cha);
	}
}