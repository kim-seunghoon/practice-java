package chapter7;
/*
 * package 예제
 * package 
 * -클래스, 인터페이스들의 모임 -> 주로 기능이 비슷한 클래스, 인터페이스들의 모임
 * -클래스 명은 패키지를 포함한다
 * -package 설정은 파일 처음에 한 번만 구현 가능 
 * -> 같은 파일에 존재하는 클래스는 같은 패키지에 속한 클래스임
 * -> 패키지가 다른 클래스는 다른 파일에 구현해야 함
 * 
 * import 예약어
 * -클래스명의 패키지명을 생략할 수 있도록 설정
 * 
 * 클래스의 패키지명을 생략 할 수 있는 경우
 * 1. 같은 패키지에 속한 클래스 사용 시
 * 2. java.lang 패키지의 클래스 사용 시
 * 3. import 구문에서 선언된 클래스 사용 시
 * 		->패키지명.클래스명 = 클래스명의 패키지명 생략 가능
 * 		->패키지명.*	   = 패키지에 속한 모든 클래스의 패키지명 생략 가능
 */
import java.util.Date;
import java.util.Scanner;
import java.util.*; //java.util 패키지 내의 클래스들은 패키지명 생략 가능
public class PackageEx1 {

	public static void main(String[] args) {
//		java.lang.String -> java.lang에 속한 클래스들은 패키지명 생략 가능
//		java.util.Date now = new java.util.Date();
		Date now = new Date();//import 구문 설정으로 패키지명 생략 가능
		A a = new A();//같은 패키지에 속한 클래스는 패키지명 생략가능
		Scanner scan = new Scanner(System.in);
		Pack1 p = new Pack1();
		p.method();
//		p.methodp(); //methodp 접근제한자가 private이므로 '직접'  접근 불가
		p.method2();
	}

}
//package a7;
class A {}
class Pack1 {
	private void methodp() {
		System.out.println("chap1.pack1.mehodp 메서드");
	}
	void method() {
		System.out.println("chap1.pack1.mehod 메서드");
	}
	void method2() {
		methodp();
	}
}
