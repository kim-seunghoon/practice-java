package practice_list;



public class gamble {
    public static void main(String[] args) {
        double dollar = dice() + dice() + dice();
        double won = exchange(dollar);
        System.out.printf("획득 금액 : $%.2f(%.0f원)", dollar, won);
    }
    public static double dice() {
        return Math.random() * 6;
    }
    public static double exchange(double dollar) {
        return dollar * 1082.25108;
    }
}
