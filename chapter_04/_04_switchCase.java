package chapter_04;

public class _04_switchCase {
    public static void main(String[] args) {
        //1등 전액 장학금 2등, 3등 반액, 그 외 없음

        int ranking = 2;
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("대상 아님");
        }
        System.out.println("조회 완료");

        //switch
        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("대상 아님");
        }
        System.out.println("조회 완료");

        //switch를 사용한는 예제
        int grade = 2;
        int price = 7000;
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격 :" + price + "" +
                "원");
        //if else의 경우 조건, 범위일 때 쓰기 좋고,
        //switch의 경우 몀확한 케이스가 있는 경우에 쓰기 좋음
    }
}
