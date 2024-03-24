package chapter_02;

public class _04_operator4 {
    public static void main(String[] args) {
        //논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = false;
        boolean 제육볶음 = false;

        System.out.println(김치찌개 && 계란말이 || 제육볶음);

        System.out.println((5 > 3) && (3 >= 1));
        System.out.println((5 > 3) && (3 <= 1));
        System.out.println((5 > 3) || (3 <= 1));

        //논리 부정 연산자
        System.out.println("------------");
        System.out.println(!true);
        System.out.println(!false);
    }
}
