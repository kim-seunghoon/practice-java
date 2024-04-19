package chapter15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
 * flatMap 예제
 * 
 * flatMap : Stream의 구조를 변경
 * 	flatMap(Function<T, Stream<U>>) : Stream 구조를 새로운 Stream 형태로 변경(완전히)
 * 	flatMapToInt(Function<T, IntStream>) : Stream 구조를 새로운 IntStream 형태로 변경(완전히)
 */
public class StreamEx7 {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("자바 8버전에","추가된 스트림을","열심히 공부하자");
		/*
		 * data : String
		 */
		list1.stream().flatMap(data->Arrays.stream(data.split(" "))).forEach(System.out::println);
		
		List<String> list2 = Arrays.asList("10,20,30", "40,50,60");
		IntStream ist = list2.stream().flatMapToInt(data->{
			//data :"10,20,30" String형
			String[] strarr = data.split(",");//{"10", "20", "30"}
			int[] intarr = new int[strarr.length];
			for (int i = 0; i < strarr.length; i++) {
				intarr[i] = Integer.parseInt(strarr[i].trim());
			}
			return Arrays.stream(intarr);//IntStream
		});
//		ist.forEach(n->System.out.println(n));
		
		//하나씩만 쓸 수 있어서 주석 처리해야 실행됨
		//숫자의 합계 출력
		System.out.println("합계 : " + ist.sum());
		//숫자의 평균 출력
		System.out.println("평균 : " + ist.average().getAsDouble());
		//숫자의 개수 출력
		System.out.println("개수 : " + ist.count());
	}

}
