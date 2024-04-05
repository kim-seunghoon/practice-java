package chapter11;
/*
 * StringBuilder/StringBuffer 클래스 : 동적 문자열
 * -두 개의 클래스는 같은 메서드를 멤버로 가짐
 * -equals 메서드를 오버라이딩하지 않음 = 내용비교 안 됨
 * ->내용 비교를 위해서는 문자열(String)으로 변경하여 비교함
 * ->toString()로 문자열로 변환 가능
 */
public class StringBuilderEx1 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("abc");
		StringBuilder sb2 = new StringBuilder("abc");
		System.out.println("sb1 == sb2 : " + (sb1 == sb2));
		System.out.println("sb1.equals(sb2) : " + sb1.equals(sb2));
		System.out.println("sb1.equals(sb2) : " + sb1.toString().equals(sb2.toString()));
	}

}
