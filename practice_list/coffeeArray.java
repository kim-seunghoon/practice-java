

public class coffeeArray {
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] soldAmount = {24, 27, 39, 41, 51, 35, 72};
        String[] week = {"월", "화", "수", "목", "금", "토", "일"};

        for (int i = 0; i < soldAmount.length; i++) {
            System.out.printf("%s요일 : %d잔\n", week[i], soldAmount[i]);
        }

        System.out.printf("총합 : %d잔", sum(soldAmount));
    }
}
