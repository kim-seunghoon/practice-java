package chapter11;

import java.util.Date;
import java.util.Calendar;

/*
 * Calendar 객체에 날짜 생성하기
 */
public class CalenadarEx2 {

	public static void main(String[] args) {
		//Calendar 클래스를 객체화 시킨 후
		Calendar day = Calendar.getInstance();
		//날짜 설정 방법
		day.set(2024, 11, 25);
		System.out.printf("날짜 : %d-%d-%d\n", day.get(Calendar.YEAR), day.get(Calendar.MONTH)+1, day.get(Calendar.DATE));
		//2024년 12월 25일의 요일?
		String w = " 일월화수목금토";
		System.out.printf("날짜 : %d-%d-%d %c요일\n", day.get(Calendar.YEAR), day.get(Calendar.MONTH)+1, day.get(Calendar.DATE), w.charAt(day.get(Calendar.DAY_OF_WEEK)));
		
		System.out.println("-----------------");
		//Date 객체를 Calendar 객체로 바꾸기
		Date now = new Date();
		now.setTime(now.getTime() + (1000*60*60*24));//1일을 추가함
		System.out.println(now);
		//day 객체로 값을 설정
		day.setTime(now);System.out.printf("날짜 : %d-%02d-%d %c요일\n", day.get(Calendar.YEAR), day.get(Calendar.MONTH)+1, day.get(Calendar.DATE), w.charAt(day.get(Calendar.DAY_OF_WEEK)));
		//Calendar 객체를 Date 객체로 바꾸기
		Date today = new Date();
		today.setTime(day.getTimeInMillis());
		System.out.println(today);
	}

}
