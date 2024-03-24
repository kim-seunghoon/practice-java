package chapter_04;

public class _06_while {
    public static void main(String[] args) {
        int distance = 25; //전체 거리
        int move = 0; //현재 이동 거리
        while (move < distance) {
            System.out.println("발차기를 계속합니다");
            System.out.println("현재 이동거리 : " + move + "m");
            move += 3; //무한루프에 빠지지않기 위한 탈출 문
        }
        System.out.println("도착하였습니다.");

        //무한 루프
        move = 0;
        while (move < distance) {
            System.out.println("발차기를 계속합니다");
            System.out.println("현재 이동거리 : " + move + "m");
        }
    System.out.println("도착하였습니다.");
    }
}
