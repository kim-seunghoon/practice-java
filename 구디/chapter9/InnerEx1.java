package chapter9;
/*
 * 내부클래스(중첩클래스) 예제
 * -클래스 내부에 존재하는 클래스
 * -참조 자료형으로 사용됨, 객체화 가능, Object 클래스의 하위 클래스, 다른 클래스를 상속받기 가능
 * -자료형 : 외부클래스.내부클래스
 * -바이트 코드도 생성 가능
 * -외부 클래스의 private 멤버 접근 가능
 * 
 * 인스턴스 내부클래스
 * -외부클래스의 객체화가 되어야 클래스 기능 사용 가능
 * 	new 외부클래스(..).new 내부클래스(..)
 * 
 * static 내부클래스
 * -외부클래스의 객체화가 필요 없음
 * 	new 외부클래스명.내부클래스명(..)
 */
class Outer1 { //외부클래스
	class InstanceInner { //인스턴스 내부클래스
		int iv = 100;
		static int cv =10;
		final static int MAX =200;
	}
	static class StaticInner { //static 내부클래스
		int iv =300;
		static int cv =400;
		final static int MAX =500;
	}
	void method() {
		class LocalInner { //지역 내부클래스 : 메서드 내부에서만 접근 가능
			int iv =600;
			static int cv =700;
			final static int MAX = 800;
		}
		LocalInner l1 = new LocalInner();
		System.out.println("LocalInner.iv = " + l1.iv);
		System.out.println("LocalInner.cv = " + LocalInner.cv);
		System.out.println("LocalInner.cv = " + LocalInner.MAX);
	}
	static void method2() {
		class LocalInner {
			int iv =900;
			static int cv = 1000;
			final static int MAX =1100;
		}
		LocalInner l1 = new LocalInner();
		System.out.println("LocalInner.iv = " + l1.iv);
		System.out.println("LocalInner.cv = " + LocalInner.cv);
		System.out.println("LocalInner.cv = " + LocalInner.MAX);
	}
}
public class InnerEx1 {

	public static void main(String[] args) {
		new Outer1().method(); //static이 없으니 클래스가 객체화가 되고 실행할 수 있음
		Outer1.method2();// 객체화와 상관 없이 바로 실행할 수 있음
		//InstanceInner 내부클래스의 객체화
		Outer1.InstanceInner Oi = new Outer1().new InstanceInner();
		System.out.println("Instance.iv = " + Oi.iv);
		System.out.println("Instance.cv = " + Outer1.InstanceInner.cv);
		System.out.println("Instance.MAX = " + Outer1.InstanceInner.MAX);
		//StaticInner 내부클래스의 객체화
		Outer1.StaticInner Os = new Outer1.StaticInner();
		System.out.println("StaticInner.iv = " + Os.iv);
		System.out.println("StaticInner.cv = " + Outer1.StaticInner.cv);
		System.out.println("StaticInner.MAX = " + Outer1.StaticInner.MAX);
	}

}
