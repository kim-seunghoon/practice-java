package chapter11;

import java.util.Date;
import java.text.SimpleDateFormat;
public class DateEx2 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.getTime());
		System.out.println(System.currentTimeMillis());
		//현재부터 5일 이후
		Date day = new Date();
		day.setTime(now.getTime() + (1000*60*60*24*5));
		System.out.println(now);
		System.out.println(new SimpleDateFormat("yyyy-MM-dd E요일").format(day));
	}

}
