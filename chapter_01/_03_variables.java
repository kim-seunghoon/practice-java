package chapter_01;

public class _03_variables {
    public static void main(String[] args) {
        String name = "김승훈";
        int hour = 15;

        System.out.println(name + "님 배송이 시작됩니다. " + hour + "시경에 방문 예정입니다.");
        System.out.println(name + "님 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        System.out.println(name + "님의 평균 점수는 " + score + "점 입니다\n학점 : " + grade);

        //상세한 소수점은 double
        double d = 3.14123456789;
        float f = 3.14123456789f;
        System.out.println(d);
        System.out.println(f);

        //int는 -21억에서 21억까지만
        long i = 1000000000000l;
        System.out.println(i);
    }
}
