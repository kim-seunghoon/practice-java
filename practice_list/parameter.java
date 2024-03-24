package practice_list;

public class parameter {
    public static void printSquare(int x) {
        System.out.println(x * x);
    }
    public static void main(String[] args) {
        int value = 2;
        printSquare(value);//4
        printSquare(3);//9
        printSquare(value * 2);//4
    }
}
