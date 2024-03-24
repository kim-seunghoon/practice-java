package chapter_02;

public class _Quiz_02 {
    public static void main(String[] args) {

        int height = 121;

        String cm = (height >= 120) ? "키가 " + height + "cm 이므로 탑승 가능합니다" :
                "키가 " + height + "cm 이므로 탑승 불가능합니다";
        System.out.println(cm);

        //같은 결과지만 다른 소스코드
        String result = (height >= 120) ? "탑승 가능합니다." : "탑승 불가능합니다.";
        System.out.println("키가 " + height + "cm 이므로 " + result);
    }
}
