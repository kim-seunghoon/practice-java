package test0403;
/*
 * Outer1클래스의 내부 클래스 Inner1, Inner2 의 멤버변수 iv의 값 출력 하기
 */
class Outer1 {
	class Inner1 {
		int iv = 100;
	}
  static class Inner2 {
		int iv = 200;
	}
}

public class Test1 {
	public static void main(String[] args) {
		Outer1.Inner1 in1 = new Outer1().new Inner1();
		System.out.println(in1.iv);
		Outer1.Inner2 in2 = new Outer1.Inner2();
		System.out.println(in2.iv);
	}
}