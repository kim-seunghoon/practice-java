package chapter5;

import java.util.Arrays;

public class ArrEx3 {

	public static void main(String[] args) {
		int[] balls = new int[45];
		int[] lotto = new int[6];
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}
		for (int i : balls) {
			System.out.print(i + ", ");
			
		}
		System.out.println();
		System.out.println("-----------");
		
		//볼 섞기
		for (int i = 0; i <= 1000; i++) {
			int f = (int)(Math.random() * balls.length);
			int t = (int)(Math.random() * balls.length);
			//swap 알고리즘
			int tmp = balls[f];
			balls[f] = balls[t];
			balls[t] = tmp;
		}
		//로또 번호에 저장하기 앞에서 6개의 값
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = balls[i];
		}
		
		//로또 정렬하기
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length - 1 - i; j++) {
				if(lotto[j] > lotto[j+1]) {
					int tmp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = tmp;
				}
			}
			System.out.print(i + " : ");
			for (int b : lotto) {
				System.out.print("[" + b + "]");
				
			}
			System.out.println();
		}
		
		//Arrays 클래스를 이용한 정렬. 배열 객체릐 다야한 기능을 제공해 주는 클래스
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = balls[i]; //정렬이전으로 초기화
		}
		for (int b : lotto) {
			System.out.println(b + ",");
			System.out.println();
			Arrays.sort(lotto);
			for (int d : lotto) {
				System.out.print(d + ",");
		}
	}
	}
}
