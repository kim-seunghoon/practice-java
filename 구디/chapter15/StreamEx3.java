package chapter15;

import java.util.Arrays;
import java.util.Random;

/*
 * Random 클래스로 Stream 생성
 */
public class StreamEx3 {

	public static void main(String[] args) {
		System.out.println("int형 난수 3개로 스트림 생성");
		new Random().ints(3).forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("0~2 사이의 int형 난수 10개로 스트림 생성");
		new Random().ints(10, 0, 3).forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("long형 난수 3개로 스트림 생성");
		new Random().longs(3).forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("0~9사이의 long형 난수 10개로 스트림 생성");
		new Random().longs(10, 0, 3).forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("A~Z사이의 char형 난수 3개로 스트림 생성");
		new Random().ints(3, 'A', 'Z'+1).forEach(s->System.out.print((char)s+" "));
		System.out.println();
		System.out.println("double형 난수 3개로 스트림 생성");
		new Random().doubles(3).forEach(s->System.out.print((double)s+" "));
		System.out.println();
		
		//1~100사이의 난수 100개를 저장한 배열생성
		int[] arr = new Random().ints(10,1,11).toArray();
		for (int i : arr) {
			System.out.print(i+", ");
		}
		System.out.println();
		//중복된 값을 제외하는 방법
		arr= Arrays.stream(arr).distinct().toArray();
		System.out.println(arr.length);
		for (int i : arr) {
			System.out.print(i + ", ");
		}
		System.out.println();
		//arr배열 중 가장 큰 수?
		System.out.println(Arrays.stream(arr).max().getAsInt());
		//arr배열 중 가장 작은 수?
		System.out.println(Arrays.stream(arr).min().getAsInt());
		//arr 배열의 짝수 중 가장 큰 수?
		System.out.println(Arrays.stream(arr).filter(i->i%2==0).max().getAsInt());
		//arr 배열의 홀수 중 가장 작은 수?
		System.out.println(Arrays.stream(arr).filter(i->i%2==1).min().getAsInt());
	}

}
