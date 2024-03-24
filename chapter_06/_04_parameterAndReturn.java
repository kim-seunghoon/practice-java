package chapter_06;

public class _04_parameterAndReturn {

    public static int getPower(int number) {
        int result = number * number;
        return result;
    }

    public static int getPowerByExp (int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;

    }
    public static void main(String[] args) {
        int retval = getPower(2);
        System.out.println(retval);

        retval = getPowerByExp(3, 5);
        System.out.println(retval);

        System.out.println(getPowerByExp(6, 8));
    }
}
