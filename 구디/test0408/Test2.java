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
	Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("찾고자 하는 번호를 입력하세요(종료 : q)");
			String num = scan.nextLine();
			if (num.equalsIgnoreCase("Q")) {
				break;
			}
			String pattern = num;
			Pattern p = Pattern.compile(pattern);
			for (int i = 0; i < phoneNumArr.length; i++) {
				String phoneNum = phoneNumArr[i];
				Matcher m = p.matcher(phoneNum);
				if (m.find()) {
					System.out.println(phoneNum);
				}
			}
		}
		System.out.println("프로그램 종료");
		
	}
}
