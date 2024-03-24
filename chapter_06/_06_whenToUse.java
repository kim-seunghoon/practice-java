package chapter_06;

public class _06_whenToUse {

    public static int getpower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        //같거나 비슷한 동작을 할 땐 메소드를 만들어서 코드의 중복을 줄인다

        //2의 제곱
        System.out.println(getpower(2, 2));

        //3의 세제곱
        System.out.println(getpower(3, 3));

        //4의 제곱
        System.out.println(getpower(4, 2));
    }
}
