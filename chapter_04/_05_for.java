package chapter_04;

public class _05_for {
    public static void main(String[] args) {
//        for (선언 ; 조건 ; 증감) {
//
//        }
        for (int i = 0; i < 10; i++) {
            System.out.println("어서오세요" + i);
        }
        //짝수만 출력
        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            System.out.println("현재까지의 총합은 " + sum + "입니다.");
        }
        System.out.println("1부터 100까지 모든 수의 합은 " + sum + "입니다.");
    }
}
