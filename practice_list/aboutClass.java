package practice_list;

public class aboutClass {
    public static void main(String[] args) {
        //객체 생성
        buger b1 = new buger ();
        b1.showInfo();
    }
}

class buger {
    //필드 : 정보
    String name;
    int price;

    //메소드 : 동작
    void showInfo() {
        System.out.println(name + " : " + price + "원");
    }
}
