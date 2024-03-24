package practice_list;

public class calculate_km_l {
    public static void main(String[] args) {
        double gasoline = 8.86;
        double distance = 182.736;
        double effiency = calEffiency(gasoline, distance);
        System.out.printf("연비 : %.2f Km/L", effiency);
    }
    public static double calEffiency(double fuel, double distance) {
        return distance / fuel;
    }
}
