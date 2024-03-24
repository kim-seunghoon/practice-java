package chapter_06;
public class _02_parameter {
    public static void power(int number) {
        int result = number * number;
        System.out.println(number + "의 2제곱은" + result);
    }

    public static void powerByExp(int number, int exponent) {
        int result =1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의 " + exponent + "제곱은 " + result);
    }

    public static void main(String[] args) {
        power(5);
        powerByExp(3, 7);
    }
}
