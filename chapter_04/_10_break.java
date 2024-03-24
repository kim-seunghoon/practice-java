package chapter_04;

public class _10_break {
    public static void main(String[] args) {
        //치킨 집에서 매일 20마리만 판매(1인 1마리 구매 가능)
        //대기 손님 50명
        int chiken = 20;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님 주문하신 치킨 나왔습니다.");
            if (i == chiken) {
                System.out.println("재료가 소진되어 구매하실 수 없습니다.");
                break;
            }
        }
        System.out.println("영업이 종료되었습니다.");
        System.out.println("------------------");
        int index = 1;
        while (index <= 50) {
            System.out.println(index + "번 손님 주문하신 치킨 나왔습니다.");
            if (index == chiken) {
                System.out.println("재료가 소진되어 구매하실 수 없습니다.");
                break;
            }
            index++;
        }
        System.out.println("영업이 종료되었습니다.");
    }
}
