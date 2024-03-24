package practice_list;

public class calculatePay {

    public static void weekPay(double hour, double basepay) {
        if (basepay < 8) {
            System.out.println("Error");
            return;
        } else if (hour > 60) {
            System.out.println("Error");
            return;
        }
        double pay = 0;

        if (hour > 40) {
            double extraHour = hour - 40;
            hour -= extraHour;
            double extraPay = basepay * extraHour * 1.5;
            pay += extraPay;
        }
        pay += basepay * hour;
        System.out.printf("$%.2f", pay);
        System.out.println();
    }

    public static void main(String[] args) {
        weekPay(40, 12.00);
        weekPay(53, 16.50);
    }
}