package practice_list;

public class for_break {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
            if (i == 100) {
                break;
            }
        }
        System.out.println(sum);
    }
}
