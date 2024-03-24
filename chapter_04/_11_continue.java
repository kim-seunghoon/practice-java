package chapter_04;

public class _11_continue {
    public static void main(String[] args) {
        int chiken = 20;
        int sold = 0;
        int noShow = 17;

        for (int i = 1; i < 51; i++) {
            System.out.println(i + "번 손님 주문하신 치킨 나왔습니다.");
            if (i == noShow) {
                System.out.println(i+ "번 손님 주문하신 치킨 나왔습니다.");
                System.out.println(i+ "번 손님 주문하신 치킨 나왔습니다.");
                System.out.println(i+ "번 손님 no show로 인해 다음 차례로 넘어갑니다.");
                continue; //즉시 멈추고 다음 반복으로 넘어감
            }
            sold++;
            if (sold == chiken) {
                System.out.println("재고가 소진 되어 주문하실 수 없습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");
        System.out.println("---------------");
        sold = 0;
        int index = 1;
        while (index <= 50) {
            System.out.println(index+ "번 손님 주문하신 치킨 나왔습니다.");
            if (index == noShow) {
                System.out.println(index+ "번 손님 noshow로 인해 다음 차례로 넘어갑니다.");
                index++;
                continue;
            }
            sold++;
            if (sold == chiken) {
                System.out.println("재고가 소진되어 주문하실 수 없습니다.");
                break;
            }
            index++;
        }
    }
}
