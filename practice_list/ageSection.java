package practice_list;

public class ageSection {
    public static void ageDivide(int age) {
        if (age >= 18) {
            System.out.println("성인");
        } else if (age >= 13) {
            System.out.println("청소년");
        } else if (age >= 6) {
            System.out.println("어린이");
        }else {
            System.out.println("유아");
        }
    }

    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        ageDivide(age);
    }
}
