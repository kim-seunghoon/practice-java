package practice_list;

public class _369_369 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.print("숫자 : ");
        for (int i = 1; i < 11; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
            sum += i;
        }
//        System.out.println("\n총합 : " + sum);
        System.out.printf("\n총합 : %d", sum);
    }
}
