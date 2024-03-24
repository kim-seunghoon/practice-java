package chapter_04;

public class _03_elseIf {
    public static void main(String[] args) {
        //한라봉 에이드가 있으면 +1
        //또는 망고주스가 있으면 +1
        //또는 아이스 아메리카노 +1

        boolean hanlabong = false;
        boolean mango = false;
        boolean orange = true;
        if (hanlabong) {
            System.out.println("한라봉 에이드+1");
        } else if (mango) {
            System.out.println("망고주스 +1");
        } else if (orange) {
            System.out.println("오렌지 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("음료 주문이 완료되었습니다.");
    }
}
