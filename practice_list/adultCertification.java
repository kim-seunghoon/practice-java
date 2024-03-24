package practice_list;

public class adultCertification {
    public static void order(int age) {
        if (age >= 18) {
            System.out.println("주문이 완료되었습니다.");
        }else {
            System.out.println("18세 이상 구매가능 상품입니다.");
        }
    }
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        order(age);
    }
}
