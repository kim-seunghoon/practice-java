package chapter11;
import java.util.Random;
/*
 * getRand(f,t) 함수 구현하기
 * f ~ t 또는  t~ f 까지 범위의 숫자를 임의의 수로 리턴하는 함수
 * f,t 값 포함
 */
public class Exam6 {

	public static void main(String[] args) {
		
	
		for (int i = 0; i < 20; i++) {
			System.out.print(getRand(1, -3) + ",");
		}
		System.out.println();
		for (int i = 0; i < 20; i++) {
			System.out.print(getRand(-1, 3) + ",");
		}
	}

	static int getRand(int i, int j) {
		int min = Math.min(i, j);
		int max = Math.max(i, j);
		int cha = max - min;
//		return (int)(Math.random() * (cha+1)) + min;
		Random r = new Random();
		r.setSeed((int)(Math.random() * 1000) + 1);
		return r.nextInt(cha+1) + min;
	}

}
