package practice_list;

import java.util.Random;

public class randomClass {
    public static void main(String[] args) {
        Random rand = new Random();

        int a = rand.nextInt();
        int b = rand.nextInt(30);
        double c = rand.nextDouble();
        boolean d = rand.nextBoolean();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
