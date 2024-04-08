package chapter11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam5 {

	public static void main(String[] args) {
		String data = "번호:1,이름:홍길동,국어:100,영어:70,수학:85,과학:95";
		String dataPattern = "(\\d{2,3})";
		Pattern p = Pattern.compile(dataPattern);
		Matcher m = p.matcher(data);
		
		int sum =0;
		while (m.find()) {
			
			System.out.println(m.group());
			sum += Integer.parseInt(m.group());
		}
		System.out.print("점수의 합 : " + sum);
		System.out.print("평균 값 : " + (double)(sum/4));
	}

}
