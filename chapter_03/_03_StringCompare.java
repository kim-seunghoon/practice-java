package chapter_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "java";
        String s2 = "Python";
        System.out.println(s1.equals("java"));
        //대소문자 구분없이 비교할 때
        System.out.println(s1.equalsIgnoreCase("Java"));

        //문자열 비교 심화
        s1 = new String("1234"); //new를  사용하면 서로 다른 곳의 데이터가 됨
        s2 = new String("1234");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));//java에서 '문자열의 내용'을 비교하고 싶으면 'equals'
    }
}
