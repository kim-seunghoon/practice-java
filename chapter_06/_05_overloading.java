package chapter_06;

public class _05_overloading {
    //매소드 오버로딩은 같은 이름의 메소드를 여러번 선언
    //전달값의 타입이 다르거나
    //전달값의 갯수가 다를 때
    public static int getPower(int number) {
        int result = number * number;
        return result;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower (int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getPower(6));
        System.out.println(getPower("9"));
        System.out.println(getPower(6, 3));
    }
}
