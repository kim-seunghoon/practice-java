package chapter_02;

public class _01_operator1 {
    public static void main(String[] args) {
        //산술 연산자

        //일반 연산
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println((double) 5 / 2);
        System.out.println(5 % 2);

        //변수를 이용한 연산
        int a = 20;
        int b = 49;
        double c;
        c = a % b;
        System.out.println(c);

        //증감 연산 ++, --

        //먼저 1을 더하고 문장을 수행하는 경우
        int val;
        val = 10;
        System.out.println(++val);
        System.out.println(val);

        //문장을 수행하고 나서 변수에 1이 더해지는 경우
        val = 10;
        System.out.println(val);
        System.out.println(val++);
        System.out.println(val);

        //대기번호 표와 같은 형식
        int waiting = 0;
        System.out.println("대기번호 : " + waiting++);
        System.out.println("대기번호 : " + waiting++);
        System.out.println("대기번호 : " + waiting++);
        System.out.println("총 대기인원 : " + waiting);
    }
}
