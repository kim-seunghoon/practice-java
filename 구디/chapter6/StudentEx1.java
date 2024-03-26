package chapter6;
/*
 * 추상화 : 클래스 생성 단계
 * 클래스 : 사용자 정의 자료형, 객체 생성 도구 -> 객체지향언어에서 가장 중요한 개념
 * 속성 : 멤버필드, 멤버변수
 * 기능 : 멤버 메서드, 멤버 함수
 * 
 * 하나의 파일에 여러개 클래스 존재 가능
 * #파일의 이름은 public class 클래스명과 같다
 * #하나의 파일에는 하나의 public class만 가능
 * java Application
 * =main 함수가 프로그램의 시작을 얘기하며, main 함수를 포함하고 있는 클래스를 구동클래스라고함
 * 구동클래스를 public class로 선언함 
 */

class Student {
	String studentNo;
	String name;
	String major;
	void study() {
		System.out.println("열심히 공부합니다");
	}
}
public class StudentEx1 {

	public static void main(String[] args) {
		Student st1 = new Student(); //객체화 = 인스턴스화
		/*
		 * new 예약어 기능
		 * 1. 힙영역에 메모리 할당 = 객체 생성
		 * 2. 멤버 필드값을 기본값으로 초기화
		 * 3. 생성자 호출
		 * 
		 * 대입연산자를 이용하여 객체의 참조값을 참조변수에 대입
		 */
		st1.studentNo = "12345";
		st1.name = "홍길동";
		st1.major = "컴퓨터공학";
		System.out.printf("학번 : %s\t이름 : %s\t전공 : %s\n", st1.studentNo, st1.name, st1.major);
		st1.study();
		
		Student st2 = new Student();
		st2.studentNo = "12346";
		st2.name = "김삿갓";
		st2.major = "경영학과";
		System.out.printf("학번 : %s\t이름 : %s\t전공 : %s\n", st2.studentNo, st2.name, st2.major);
		st2.study();
		
		st2 = st1;
		st1.name = "이몽룡";
		System.out.printf("학번 : %s\t이름 : %s\t전공 : %s\n", st1.studentNo, st1.name, st1.major);
		st1.study();
		System.out.printf("학번 : %s\t이름 : %s\t전공 : %s\n", st2.studentNo, st2.name, st2.major);
		st2.study();
	}

}
