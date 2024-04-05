package chapter11;
/*
 * String 클래스
 * -정적인 문자열. 변경 불가 문자열
 * -+연산자 가능한 유일한 클래스. 문자열 = 문자열+기본형
 * -대입 연산자를 이용하여 객체 생성 가능한 유일한 클래스
 * 	String s1 = "문자열
 * 	String s2 = new String("문자열")
 * -final 클래스임. 다른 클래스의 부모클래스 불가 = 상속불가 클래스
 */
public class StringEx1 {

	public static void main(String[] args) {	
		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		String s3 = new String("abc");
		String s4 = new String("abc");
		System.out.println("s3 == s4 : " + (s3 == s4));
		System.out.println("s3.equals(s4) : " + s3.equals(s4));
	}

}
