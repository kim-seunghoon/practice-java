package chapter_02;

public class _05_operator5 {
    public static void main(String[] args) {
        //삼항 연산자
        //결과 = 조건 ? (참일 경우의 값) : (거짓일 경우의 값)
        int x = 10;
        int y = 70;

        //결과를 문자로 받는다!
        String max = (x == y) ? "맞는 계산입니다" : "틀린 계산입니다";
        System.out.println(max);

        //결과를 참 거짓으로 받는다!
        boolean result = (x == y) ? true : false;
        System.out.println(result);
    }
}
