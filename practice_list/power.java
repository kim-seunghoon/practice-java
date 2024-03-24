package practice_list;

import java.util.Arrays;

public class power {
    public static void main(String[] args) {
        int[] values = new int[10];

        for (int i = 0; i < values.length; i++) {
            values[i] = (int) Math.pow(2, i);
        }

        System.out.println(Arrays.toString(values));
    }
}
