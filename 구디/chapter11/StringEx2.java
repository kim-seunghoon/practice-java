package chapter11;
/*
 * String 클래스의 주요 메서드
 */
public class StringEx2 {

	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		//charAt(4) : 문자열에서 4번 인덱스(5번 째)의 문자 리턴
		System.out.println("s.charAt(4) : " + s.charAt(4));
		/*
		 * s.compareTo(문자열) : 정렬에 사용되는 메서드
		 * 		if 결과=양수 : s 문자열이 뒷 쪽
		 * 		if 결과=음수 : s 문자열이 앞 쪽
		 */
		System.out.println("s.copareTo(\"abc\") : " + s.compareTo("abc"));
		System.out.println("s.copareTo(\"AAA\") : " + s.compareTo("AAA"));
		//IgnoreCase : 대소문자 상관없이
		System.out.println("s.copareToIgnoreCase(\"abc\") : " + s.compareToIgnoreCase("abc"));
		//s.endsWith("GH") : s 문자열의 끝이 GH?
		System.out.println("s.endsWith(\"GH\") : " + s.endsWith("GH"));
		//s.starsWith("AB") : s 문자열의 시작이 AB?
		System.out.println("s.startsWith(\"AB\") : " + s.startsWith("AB"));
		//s.equals("ABCDEFGH") : s 문자열이 ABCDEFGH와 같은지?
		System.out.println("s.equals(\"ABCDEFGH\") : " + s.equals("ABCDEFGH"));
		//s.equalsIgnoreCase("ABCDEFGH") : s 문자열이 대소문자 구분 없이 ABCDEFGH와 같은지?
		System.out.println("s.equalsIgnoreCAse(\"ABCDEFGH\") : " + s.equalsIgnoreCase("ABCDEFGH"));
		//s.getbytes : s 문자열을  byte형 배열로 리턴
		byte[] barr =s.getBytes();
		for (byte b : barr) {
			System.out.print((char)b);
		}
		System.out.println();
		char[] carr = s.toCharArray();
		for (char c : carr) {
			System.out.print(c);
		}
		s = "This is a String";
		//s.indexOf('i') : i 문자의 인덱스 값 리턴, 없는 문자는 -1 리턴
		System.out.println("s.indexOf('i') : " + s.indexOf('i'));
		//s.indexOf('i', 3) : 3번 인덱스부터 i 문자의 인덱스 값 리턴
		System.out.println("s.indexOf('i', 3) : " + s.indexOf('i', 3));
		//s.lastindexOf('i') : i 문자를 뒤에서 부터 인덱스 값 리턴
		System.out.println("s.lastIndexOf('i') : " + s.lastIndexOf('i'));
		//문자열의 길이
		System.out.println("s.length() : " + s.length());
		//문자열의 치환
		System.out.println("s.replace('is', 'QR') : " + s.replace("is", "QR"));
		//부분 문자열
		//s.substring(5) : 5번 인덱스 이후 부분 문자열
		System.out.println("s.substring(5) : " + s.substring(5));
		//s.substring(5, 13) : 5번 인덱스부터 12번 인덱스가지 부분 문자열
		System.out.println("s.substring(5, 13) : " + s.substring(5, 13));
		//대소문자 변경
		System.out.println("s.toUpperCase() : " + s.toUpperCase());
		System.out.println("s.toLowerCase() : " + s.toLowerCase());
		//양쪽 공백 제거
		s = "   문자열 trim method     ";
		System.out.println("s.trim() : " + s.trim());
		s = "홍길동,이몽룡,김삿갓";
		String[] arr = s.split(",");
		for (String a : arr) {
			System.out.println(a);
		}
	}

}
