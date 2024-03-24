package chapter_06;

public class _Quiz_06 {

public static String getHiddenData(String data, int index) {
    String hidden = data.substring(0, index);
    for (int i = 0; i < data.length() - index; i++) {
        hidden += "x";
    }
    return hidden;
}



    public static void main(String[] args) {
        String name = "나코딩";
        String idNumber = "990130-1234567";
        String phoneNumber = "010-1234-5678";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(idNumber, 8));
        System.out.println("전화번호 : " + getHiddenData(phoneNumber, 9));
    }
}
