package practice_list;

public class andOperaator {
    public static String item(int hp, int mp) {
        String result = "아이템을 착용할 수 없습니다.";
        if (hp >= 2000 && mp >= 2000)
            result = "아이템이 착용되었습니다.";
        return result;
    }
    public static void main(String[] args) {
        int hp = Integer.parseInt(args[0]);
        int mp = Integer.parseInt(args[1]);
        System.out.println(item(hp, mp));
    }
}
