package chapter15;

import java.util.Arrays;
import java.util.List;

/*
 * mapXXX 메서드 : 스트림의 요소를 변경하는 메서드
 * mapToInt : Stream -> IntStream
 * map : Stream -> Stream
 */
public class StreamEx5 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동전", "춘향전", "구운몽", "전우치전");
		//전체 글자수 출력
		/*
		 * list.stream() : 홍길동전,춘향전,구운몽,전우치전
		 * mapToInt(String::length) : 4,3,3,4
		 */
		System.out.println(list.stream().mapToInt(String::length).sum());
		List<Student> list2 = Arrays.asList(
				new Student("홍길동", 55, 90, "경영"),
				new Student("김삿갓", 95, 90, "컴공"),
				new Student("이몽룡", 75, 80, "통계"),
				new Student("임꺽정", 65, 70, "심리"),
				new Student("성춘향", 55, 80, "컴공"));
		//이름만 출력하기
		/*
		 * list.stream() : 요소의 자료형 = Student
		 * map(Student ::getName) : 요소의 자료형 = String
		 * 
		 * Stream<Student> -> Stream<String>
		 */
		list2.stream().map(Student :: getName).forEach(System.out::println);
		//영어 점수 목록, 합계 출려
		list2.stream().mapToInt(Student::getEng).forEach(System.out::println);
		System.out.println(list2.stream().mapToInt(Student::getEng).sum());
		//peek : 중간 단계 메서드 = 위 두 문장을 한 번에 쓸 수 있음
		System.out.println(list2.stream().mapToInt(s->s.getEng()).peek(s->System.out.println(s + " ")).sum());
		//점수합계의 목록과 전체 점수 합계 출력하기
		System.out.println(list2.stream().mapToInt(s->(s.getEng() +s.getMath())).peek(s->System.out.println(s)).sum());
	}

}
