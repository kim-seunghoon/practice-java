package chapter15;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/*
 * 1부터 100까지의 임의의 수 100개를 IntStream에 저장하고
 * 저장된 수의 총합, 평균, 짝수의 평균, 홀수의 평균출력
 * 짝수의 개수, 홀수의 개수
 */
public class Exam2 {

	public static void main(String[] args) {
		Random r = new Random();
		IntStream in = r.ints(1000000,1,101);
		r.setSeed(System.currentTimeMillis());
		int[] arr2 = in.toArray();
		long stime = System.currentTimeMillis();
		int sum = 0, esum = 0, osum =0, ecnt = 0, ocnt = 0;
		for (int i : arr2) {
			sum +=i;
			if (i%2==0) {
				ecnt++;
				esum += i;
			}
			if (i%2==1) {
				ocnt++;
				osum += i;
			}
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (double)sum/arr2.length);
		System.out.println("짝수의 평균 : " + (double)esum/ecnt);
		System.out.println("홀수의 평균 : " + (double)osum/ocnt);
		System.out.println("짝수의 개수 : " + ecnt);
		System.out.println("홀수의 개수 : " + ocnt);
		System.out.println("배열방식 처리시간: " + (System.currentTimeMillis()-stime));
		
		//stream으로 처리
		stime = System.currentTimeMillis();
		System.out.println("------stream 방식---------");
		System.out.println("총합 : " + Arrays.stream(arr2).sum());
		System.out.println("평균 : " + Arrays.stream(arr2).average().getAsDouble());
		System.out.println("짝수의 평균 : " + Arrays.stream(arr2).filter(i->i%2==0).average().getAsDouble());
		System.out.println("홀수의 평균 : " + Arrays.stream(arr2).filter(i->i%2==1).average().getAsDouble());
		System.out.println("짝수의 개수 : " + Arrays.stream(arr2).filter(i->i%2==0).count());
		System.out.println("홀수의 개수 : " + Arrays.stream(arr2).filter(i->i%2==1).count());
		System.out.println("Strem방식 처리시간: " + (System.currentTimeMillis()-stime));
	}
}
