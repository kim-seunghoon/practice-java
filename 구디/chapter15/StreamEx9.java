package chapter15;

import java.util.Arrays;

/*
 * boxed 메서드 : IntStream -> Stream<Integer>로 만들어줌
 * 	asLongStream() : IntStream -> LongStream
 * 	asDoubleStream() : IntStream -> DoubleStream
 */
public class StreamEx9 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60};
		System.out.println("IntStream -> Strea<Integer>");
		Arrays.stream(arr).boxed().forEach(i->System.out.println(i.hashCode() + " "));
		Integer arr2[] = {10,20,30,40,50,60};
		Arrays.stream(arr2).forEach(i->System.out.println(i.hashCode() + " "));
		System.out.println("Stream<Integer> -> IntStream");
		System.out.println("arr2 배열의 합 : " + Arrays.stream(arr2).mapToInt(a->a).sum());
		System.out.println("IntStream -> DoubleStream");
		Arrays.stream(arr).asDoubleStream().forEach(a->System.out.println(a + " "));
		System.out.println("IntStream -> LongStream");
		Arrays.stream(arr).asLongStream().forEach(a->System.out.println(a + " "));
		
	}

}
