package test0408;
/*
 * format 메서드 구현하기
 * 메서드명 : String format (String str,int len,int align)
 * 기능 : 주어진 문자열을 지정된 크기의 문자열로 변환.
 *        나머지 공간은 공백으로채운다.
 *      (0 : 왼쪽 정렬, 1: 가운데 정렬, 2:오른쪽 정렬)     
 [결과]
 가나다    
  가나다  
    가나다
가나 
 */

public class Test1 {
	public static void main(String[] args) {
		String str = "가나다";
		System.out.println(format(str, 7, 0));
		System.out.println(format(str, 7, 1));
		System.out.println(format(str, 7, 2));
		System.out.println(format(str, 2, 0));
	}

	private static String format(String str, int len, int align) {
		if (str.length() >= len) {
			return str.substring(0, len);
		}
		StringBuilder s1 = new StringBuilder();
		for (int i = 0; i < len; i++) {
			s1.append(" ");
		}
		s1.replace(len - str.length(), len, str);
		if (align == 0) {
			return str.substring(0, str.length());
		}
		if (align == 1) {
		
		}
		return s1.toString();
	}
}