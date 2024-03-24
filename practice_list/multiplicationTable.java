package practice_list;

public class multiplicationTable {
    public static void main(String[] args) {
        int multiple = 0;
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {
                multiple = i * j;
                System.out.println(i + " x " + j + " = " + multiple);
            }
            System.out.println();
        }
    }
}
