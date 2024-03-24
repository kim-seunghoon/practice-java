package practice_list;

import java.util.ArrayList;
import java.util.Random;

public class random_dice_avg {
        public static void main(String[] args) {
            //1.입력값 받기
            int N = Integer.parseInt(args[0]);

            //2.n면체 주사위 생성
            Die d = new Die(N);

            //3.1000번 주사위를 던져 결과를 저장
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            for (int i = 0; i < 1000; i++) {
                int randnum = d.roll();
                numbers.add(randnum);
            }
            //4.평균값 계산
            double avg = average(numbers);
            //5.출력
            System.out.println(args[0] + "면체 주사위를 1000번 던졌을 때의 평균 값?" +
                    " : " + avg);
        }
        public static double average(ArrayList<Integer> list) {
            double sum = 0;
            for(Integer n : list) {
                sum += n;
            }
            return sum / list.size();
        }
    }
    class Die {
    private int maxNumber;

    public Die(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int roll() {
        Random rand = new Random();
        return 1 + rand.nextInt(maxNumber);
    }
    }


