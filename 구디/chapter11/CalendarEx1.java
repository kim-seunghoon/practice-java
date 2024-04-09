package chapter11;

import java.util.Calendar;

/*
 * Calendar 클래스 : 추상 클래스(객체화 불가) -> new Calendar() 형태로 객체화가 안 된다는 뜻
 * 	static 메서드 : getInstance() 메서드로 객체를 리턴
 */
public class CalendarEx1 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); //현재 일시
		//클래스명 출력
		System.out.println(now.getClass().getName());
		System.out.println(now);
		//get : 일자 관련 정보 제공 메서드
		System.out.println("년도 : " + now.get(Calendar.YEAR));
		System.out.println("월(0~11) : " + now.get(Calendar.MONTH));
		System.out.println("년도 기준 몇 째 주 : " + now.get(Calendar.WEEK_OF_YEAR));
		System.out.println("월 기준 몇 번째 주 : " + now.get(Calendar.WEEK_OF_MONTH));
		System.out.println("일자 : " + now.get(Calendar.DATE));
		System.out.println("일자 : " + now.get(Calendar.DAY_OF_MONTH));
		System.out.println("년 기준 일자 : " + now.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1 : 일요일 ~ 7: 토요일) : " + now.get(Calendar.DAY_OF_WEEK));
		System.out.println("월 기준 몇 번째 요일 : " + now.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전(0) 오후(1) : " + now.get(Calendar.AM_PM));
		System.out.println("시간(0~11) : " + now.get(Calendar.HOUR));
		System.out.println("시간(0~23) : " + now.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 : " + now.get(Calendar.MINUTE));
		System.out.println("초 : " + now.get(Calendar.SECOND));
		System.out.println("밀리초 : " + now.get(Calendar.MILLISECOND));
		System.out.println("TimeZone : " + now.get(Calendar.ZONE_OFFSET)/(1000*60*60));
		//마지막 일자
		System.out.println("이번 달의 마지막 일자 : " + now.getActualMaximum(Calendar.DATE));
	}

}
