package practice_list;

public class useMethod {
    public static void main(String[] args) {
        rameynProcess();
    }

    public static void rameynProcess() {
        buy();
        put();
        boil();
        eat();
    }

    public static void buy() {
        System.out.println("라면을 구입한다.");
    }
    public static void eat() {
        System.out.println("라면을 먹는다.");
    }
    public static void boil() {
        System.out.println("라면을 끓인다.");
    }
    public static void put() {
        System.out.println("라면을 넣는다.");
    }
}
