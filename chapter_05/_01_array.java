package chapter_05;

public class _01_array {
    public static void main(String[] args) {
        //배열 : 같은 자료형이 값 여러 개를 저장하는 연속된 공간
        String coffee_ross = "아메리카노";
        String coffee_roni = "카페모카";
        String coffee_nickole = "라떼";
        String coffee_marks = "카푸치노";

        System.out.println(coffee_marks + " 한 잔");
        System.out.println(coffee_roni + " 한 잔");
        System.out.println(coffee_nickole + " 한 잔");
        System.out.println(coffee_ross + " 한 잔");

        //배열 선언 첫 번째 방법
//        String[] coffees = new String[4];
//        coffees[0] = "Americano";
//        coffees[1] = "CafeMoka";
//        coffees[2] = "Latte";
//        coffees[3] = "Cappuccino";

        //두 번째 방법
//        String coffees[] = new String[4];

        //세 번째 방법
//        String[] coffees = new String[] {"americano", "cafeMoka", "latte", "cappuccino"};

        //네 번째 방법
        String[] coffees = {"americano", "cafeMoka", "latte", "cappuccino"};
        System.out.println(coffees[0] + "한 잔");
        System.out.println(coffees[1] + "한 잔");
        coffees[2] = "orangeJuice";
        System.out.println(coffees[2] + "한 잔");
        System.out.println(coffees[3] + "한 잔");
    }
}
