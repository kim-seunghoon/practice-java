package chapter_04;

public class _07_doWhile {
    public static void main(String[] args) {
        int distance = 25;
        int move= 0;
        int height = 2;

        while (move + height < distance) {
            System.out.println("발차기를 계속합니다");
            System.out.println("현재 이동거리 : " + move + "m");
            move += 3;
        }
        System.out.println("도착.");

        //키가 엄청나게 큰 사람?
        move = 0;
        height = 25;
        while (move + height < distance) {
            System.out.println("발차기를 계속합니다");
            System.out.println("현재 이동거리 : " + move + "m");
            move += 3;
        }
        System.out.println("도착.");
        System.out.println("-------------");

        //do while 조건 상관없이 일단 하고, 조건 발동
        do {
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동 거리 : " + move + "m.");
        } while (move + height < distance);
        System.out.println("도착하였습니다.");
    }
}
