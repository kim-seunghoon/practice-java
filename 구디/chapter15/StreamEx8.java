package chapter15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx8 {

	public static void main(String[] args) {
		List<Student> list1 = Arrays.asList(new Student("홍길동",70,80,"경영"),new Student("김길동",75,70,"경영"));
		List<Student> list2 = Arrays.asList(new Student("김삿갓",90,88,"경영"),new Student("김길동",95,75,"경영"));
		List<List<Student>> list = new ArrayList<>();
		list.add(list1);
		list.add(list2);
		/*
		 * Stream<List<Student>> list.stream()
		 * s: List<Student> 형
		 */
		Stream<Student> st = list.stream().flatMap(s->s.stream());
		//영어 점수 합계 출력
		System.out.println(st.mapToInt(s->s.getEng()).sum());
	}

}
