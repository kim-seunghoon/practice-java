package chapter11;
/*
 * StringBuilder 주요 메서드
 */
public class StringBuilderEx2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("abc").append(123).append('A').append(false);
		System.out.println(sb);
		sb.delete(2, 4);
		System.out.println(sb);
		sb.deleteCharAt(4);
		System.out.println(sb);sb.insert(5, "==");
		System.out.println(sb);
		sb = new StringBuilder("ABCDEFG");
		sb.replace(0, 3, "abc");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
