package chapter_02;

public class _02_operator2 {
    public static void main(String[] args) {
        //대입 연산자

        int num = 10;
        num = num + 2;
        System.out.println(num);
        num = num * 5;
        System.out.println(num);

        //복합 대입 연산자
        num = 10;
        num += 2; //num = num + 2와 같은 사용법
        System.out.println(num);
        num *= 7;
        System.out.println(num);
        num %= 5;
        System.out.println(num);
    }
}
