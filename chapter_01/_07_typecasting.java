package chapter_01;

public class _07_typecasting {
    public static void main(String[] args) {
        //형변환
        //정수형에서 실수형으로
        //실수형에서 정수형으로


        //int to float, double
        int score = 93;
        System.out.println(score);
        System.out.println((float) score);
        System.out.println((double) score);

        //반대
        float score2 = 98.7f;
        double score3 = 93.5;
        System.out.println((int)score2);
        System.out.println((int)score3);

        score3 = score3 + 85;
        System.out.println(score3);
        //변수에 형변환된 데이터 집어넣기
        int score4 = (int)score3;
        System.out.println(score4);

        //숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(97.6);
        s2 = Double.toString(95.2);
        System.out.println(s2);

        //문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("23.5");
        System.out.println(d);

        int error = Integer.parseInt("자바");
        System.out.println(error);

    }
}
