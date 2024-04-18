package chapter15;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Predicate 인터페이스 : 매개변수 존재. 리턴 값은 boolean
 * 	boolean test() : 추상 메서드
 */
public class LambdaEx6 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 55, 90, "경영"),
			new Student("김삿갓", 95, 90, "컴공"),
			new Student("이몽룡", 75, 80, "통계"),
			new Student("임꺽정", 65, 70, "심리"),
			new Student("성춘향", 55, 80, "컴공"));
	public static void main(String[] args) {
		System.out.println("영어 점수가 60점 이상인 학생의 영어 평균 : " + avgEng(t->t.getEng() >= 60));
		System.out.println("컴공과 학생의 영어 평균 : " + avgEng(t->t.getMajor().equals("컴공")));
		System.out.println("컴공과가 아닌 학생의 영어 평균 : " + avgEng(t->!t.getMajor().equals("컴공")));
	}
	private static double avgEng(Predicate<Student> p) {
		int sum = 0, cnt = 0;
		for (Student s : list) {
			if (p.test(s)) {
				sum += s.getEng();
				cnt++;
			}
		}
		return (double)sum/cnt;
	}
}
