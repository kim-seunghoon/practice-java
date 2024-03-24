package chapter_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 10;
        int price = hour * 4000;
        boolean smallCar = true;
        boolean disablePerson = false;

        if (price > 30000) {
            price = 30000;
        }
        if (smallCar || disablePerson) {
            price /= 2;
        }
        System.out.println("주차요금 은 " + price + "입니다.");
    }
}
