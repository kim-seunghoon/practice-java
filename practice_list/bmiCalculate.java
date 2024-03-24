package practice_list;

public class bmiCalculate {
    public static double calBmi(double weight, double height) {
        return weight / (height * height) ;
    }
    public static void printBmi(double bmi) {
        System.out.printf("BMI : %.2f\n", bmi);
        if (bmi >= 30) {
            System.out.println("비만");
        } else if (bmi >= 25) {
            System.out.println("과체중");
        } else if (bmi >= 18) {
            System.out.println("정상");
        } else {
            System.out.println("저체중");
        }
    }
    public static void main(String[] args) {
        double weight = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);
        double bmi = calBmi(weight, height);
        printBmi(bmi);
    }
}
