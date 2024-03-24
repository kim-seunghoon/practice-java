package practice_list;

public class calculateKcal {
    public static void main(String[] args) {
        double walkStep = walkingKcal(5000);
        System.out.println("소모 칼로리: " + walkStep + "kcal");
    }
    public static double walkingKcal(double x) {
        return x * 0.02;
    }
}
