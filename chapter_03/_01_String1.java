package chapter_03;

public class _01_String1 {
    public static void main(String[] args) {
        //자바에서 쓸 수 있는 대표적인 문자열
        String s = "I like Java and Python and C.";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length());

        //대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        //포함관계
        System.out.println(s.contains("Java"));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.indexOf("java")); //포함되지 않으면 -1반환
        System.out.println(s.lastIndexOf("and"));
        System.out.println(s.startsWith("I"));
        System.out.println(s.endsWith("."));


    }
}
