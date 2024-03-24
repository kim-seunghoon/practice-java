package chapter_04;

public class _01_if {
    public static void main(String[] args) {
        //조건문
        int hour = 15;
        //if문 내에서 하나의 문장을 실행할 땐 {}생략가능
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료");

        //두 가지 조건을 사용하는 경우
        hour = 10;
        boolean morningCoffee = true;
        if (hour < 14 && morningCoffee == false) {
        //if (hour < 14 && !morningCoffee)
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료");


    }
}
