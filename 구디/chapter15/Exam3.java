package chapter15;

import java.util.Arrays;
import java.util.List;

class Member {
	private String name;
	private int gender;
	private int age;
	public Member(String name, int gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
}
public class Exam3 {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", 1, 30), new Member("장옥정", 2, 20),
				new Member("이몽룡", 1, 45), new Member("성춘향", 2, 27));
		System.out.println("남자 나이의 평균 출력하기");
		System.out.println(list.stream().filter(s->s.getGender() == 1).mapToInt(s->s.getAge()).peek(s->System.out.println(s)).average().getAsDouble());
		System.out.println("여자 나이의 평균 출력하기");
		System.out.println(list.stream().filter(s->s.getGender() == 2).mapToInt(s->s.getAge()).peek(s->System.out.println(s)).average().getAsDouble());
		System.out.println("남자 이름 출력하기");
		list.stream().filter(s->s.getGender() == 1).map(Member :: getName).forEach(System.out::println);
		System.out.println("여자 이름 출력하기");
		list.stream().filter(s->s.getGender() == 2).map(Member :: getName).forEach(System.out::println);
	}

}
