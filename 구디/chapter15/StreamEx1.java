package chapter15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 55, 90, "경영"),
			new Student("김삿갓", 95, 90, "컴공"),
			new Student("이몽룡", 75, 80, "통계"),
			new Student("임꺽정", 65, 70, "심리"),
			new Student("성춘향", 55, 80, "컴공"));
	public static void main(String[] args) {
		//list.stream : stream 객체로 변경
		Stream<Student> st = list.stream();
		//forEach : 내부반복자
		st.forEach(s->{ //s : Student 객체
			System.out.print(s);
			int sum = s.getEng() + s.getMath();
			double avg = sum/2.0;
			System.out.printf(", 총점 : %d, 평균 : %.2f\n", sum, avg);
		});
//		System.out.println("수학 점수 총점 : " + st.mapToInt(s->s.getMath()).sum()); //stream은 이렇게 사용 불가
		//mapToInt : Stream -> IntStream으로 변경
		//sum() : IntStream 내부의 요소들의 합
		System.out.println("수학 점수 총점 : " + list.stream().mapToInt(s->s.getMath()).sum());
		System.out.println("영어 점수 총점 : " + list.stream().mapToInt(s->s.getEng()).sum());
		System.out.println("수학 점수 평균 : " + list.stream().mapToDouble(s->s.getMath()).average().getAsDouble());
		System.out.println("영어 점수 평균 : " + list.stream().mapToDouble(s->s.getEng()).average().getAsDouble());
		System.out.println("전체 인원수 : " + list.stream().count());
	}

}
