package chapter13;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
 * 학생의 학번과 이름이 같은 경우 같은 학생으로 인식되도록 프로그램 구현하기
 * student 클래스
 * 멤버변수 : 학번, 이름, 전공
 * 멤버메서드 : 학생 정보가 출력되도록 toString메서드 오버라이딩하기
 * 생성자 : 구동 클래스에 맞도록 구현하기
 */
class Student {
	int studno;
	String name;
	String major;
	Student(int studno, String name, String major) {
		this.studno = studno;
		this.name = name;
		this.major = major;
	}
	@Override
	public String toString() {
		return "학번 : " + studno + ", 이름 : " + name + ", 전공 : " + major;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, studno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && studno == other.studno;
	}
	
}
public class Exam2 {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student(1234, "홍길동", "경영"));
		set.add(new Student(2345, "홍길순", "경영"));
		set.add(new Student(2345, "홍길순", "컴공"));
		set.add(new Student(1234, "홍길동", "통계"));
		set.add(new Student(4567, "홍길동", "경영"));
		System.out.println("등록 학생수 : " + set.size());
		System.out.println("등록학생=====");
		for (Student s : set) {
			System.out.println(s);
		}
	}

}
