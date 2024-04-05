package chapter11;

import java.util.Iterator;

public class Exam3 {

	public static void main(String[] args) {
		System.out.println(delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println(delChar2("~!@#$%^&*()", "(1!2@3^4~5)"));
	}

	private static StringBuilder delChar(String s1, String s2) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i); 
			if (s2.indexOf(ch) < 0) {//문자가 없어야 추가하는 의미
				sb.append(ch);
			}
		}
		return sb;
	}
	
	private static String delChar2(String s1, String s2) {
		String s = "";
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if(!s2.contains(ch+"")) {
				s += ch;
			}
		}
		return s;
	}
}
