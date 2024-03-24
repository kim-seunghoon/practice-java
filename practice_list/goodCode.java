package practice_list;

public class goodCode {
    public static void printAge(int age) {//a->age로 파리미터 의미부여
        if (age >= 18) {
            System.out.println("성인입니다.");
        } else if (age >= 13) {
            System.out.println("청소년입니다.");
        } else if (age >= 6) {
            System.out.println("어린이입니다.");
        } else {
            System.out.println("유아입니다.");
        }
    }

    public static void main(String[] args) {
        int age = 17;
        printAge(age);
    }
}
