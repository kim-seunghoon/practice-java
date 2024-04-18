package chapter15;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exam1 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 55, 90, "경영"),
			new Student("김삿갓", 95, 90, "컴공"),
			new Student("이몽룡", 75, 80, "통계"),
			new Student("임꺽정", 65, 70, "심리"),
			new Student("성춘향", 55, 80, "컴공"));
	public static void main(String[] args) {
	int msum = 0, esum = 0;
		for (Student s : list) {
		System.out.print(s);
		System.out.printf("총점 : %d, 평균 : %.2f\n", s.getMath()+s.getEng(), (s.getMath()+s.getEng())/2.0);
		msum += s.getMath();
		esum += s.getEng();
		
	}
		System.out.println("수학 점수 총점 : " + msum);
		System.out.println("영어 점수 총점 : " + esum);
	}
}
