package test0408;
/*
 phoneNumArr 에서
 전화번호 일부를 입력받아 입력받은 번호를 포함하고 있는 번호를 찾기
q를 입력받을때 까지 계속 반복하기

[결과]   
찾고자 하는 번호를 입력하세요(종료:q)
02
02-3456-7890
02-1234-7890
찾고자 하는 번호를 입력하세요(종료:q)
1234
051-1234-5678
02-1234-7890
찾고자 하는 번호를 입력하세요(종료:q)
q
*/
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
	public static void main(String[] args) {
		String[] phoneNumArr = {
				"02-3456-7890","053-2456-7980", 
				"088-2346-9870","013-3456-7890",
				"051-1234-5678","02-1234-7890"};
		
		for (String s : phoneNumArr) {
			if (s.equals("(0[0-9]{1,2})-(\\d{4})-(\\d{4})")) {
				System.out.println(s);
			}
			String telPattern = ("(02)-(\\d{4})-(\\d{4})");
			Pattern p = Pattern.compile(telPattern);
			Matcher m = p.matcher(s);
			int i = 0;
			while (m.find()) {
				System.out.println(++i+ " : " +m.group()+m.group(1)+m.group(2));
			}
			String telPattern2 = ("(0[0-9]{1,2})-(1234)-(\\d{4})");
			Pattern p1 = Pattern.compile(telPattern2);
			Matcher m1 = p.matcher(s);
			int i2 = 0;
			while (m1.find()) {
				System.out.println(++i2+ " : " +m1.group()+m1.group(1)+m1.group(2));
			}
		}
		
	}
}