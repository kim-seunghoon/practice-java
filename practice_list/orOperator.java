package practice_list;

public class orOperator {
    public static void getOff(int workHour, int getOffTime) {
        if (getOffTime <= 18 || workHour <= 8) {
            System.out.println("Good");
        }
        else {
            System.out.println("Bad");
        }
    }

    public static void main(String[] args) {
        int workHour = Integer.parseInt(args[0]);
        int getOffTime = Integer.parseInt(args[1]);
        getOff(workHour, getOffTime);
    }
}
