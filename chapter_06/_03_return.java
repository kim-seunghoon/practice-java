package chapter_06;

public class _03_return {
    //호텔 전화번호
    public static String phoneNumber() {
        String number = "02 -1224-5322";
        return number;
    }
    //호텔 주소
    public static String address() {
        return "서울시 어딘가";
    }
    //호텔 액티비티
    public static String activity() {
        return "swimming";
    }

    public static void main(String[] args) {
        String number = phoneNumber();
        System.out.println("호텔 TEL : " + number);

        String hoteladdress = address();
        System.out.println("호텔 주소 : " + hoteladdress);

        System.out.println("호텔 액티비티 : " + activity() );
    }
}
