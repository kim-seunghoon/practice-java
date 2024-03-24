package practice_list;

public class visitorsAvg {

    public static int average(int[] visitoravg) {
        int avg = 0;
        for (int i = 0; i < visitoravg.length; i++) {
            avg += visitoravg[i];
        }
        return avg / visitoravg.length;
    }
    public static void main(String[] args) {
        String[] week = {"월", "화", "수", "목", "금", "토", "일"};
        int[] visitors = {257, 281, 234, 232, 187, 99, 116};

        System.out.println("하루 평균 접속자 : " + average(visitors));
    }
}
