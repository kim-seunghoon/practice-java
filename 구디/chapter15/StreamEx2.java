package chapter15;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.Random;

/*
 * IntStream 에제
 * 	int형 값들의 모임
 */
public class StreamEx2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println("Arrays.stream 메서드를 이용하여 IntStream 생성");
		IntStream is1 = Arrays.stream(arr);
//		is1.forEach(System.out::println);//메서드 참조방식
		is1.forEach(s->System.out.print(s));
		//is1의 합계 출력하기
		System.out.print(Arrays.stream(arr).sum());
		System.out.println();
		System.out.println("IntStream.of 메서드를 이용하여 IntStream 생성");
		IntStream.of(arr).forEach(s->System.out.print(s));
		System.out.println();
		System.out.println("IntStream.range 메서드를 이용하여 IntStream 생성");
		IntStream.range(1, 10).forEach(s->System.out.print(s));
		System.out.println();
		System.out.println("IntStream.rangeClosed 메서드를 이용하여 IntStream 생성");
		IntStream.rangeClosed(1, 10).forEach(s->System.out.print(s));
		System.out.println();
		//1~100까지의 합
		System.out.println("1~100까지의 합 : " + IntStream.rangeClosed(1, 100).sum());
		//1~100까지 짝수 합
		System.out.println("1~100까지 짝수의 합 : " + IntStream.rangeClosed(1, 100).filter(i->i%2==0).sum());
		//1~100까지 짝수값의 평균
		System.out.println("1~100까지 짝수의 평균 : " + IntStream.rangeClosed(1, 100).filter(i->i%2==0).average().getAsDouble());
		//1~10사이의 난수 5개 생성
		IntStream is2 = new Random().ints(5,1,11);
		is2.forEach(s->System.out.print(s+","));
		System.out.println();
		//Array 객체 <- IntStream
		int[] arr2 = new Random().ints(5,1,11).toArray();
		for (int j : arr2) {
			System.out.print(j + ",");
		}
	}

}
