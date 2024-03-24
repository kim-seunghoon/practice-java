package practice_list;

public class countdown {
    public static void main(String[] args) {
        int count = 5;
        System.out.println("카운트를 시작합니다..");
        while (count >= 0) {
            System.out.println(count + "!");
            count --;
        }
        System.out.println("발사!");
    }
}
