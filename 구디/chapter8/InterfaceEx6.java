package chapter8;
/*
 * jdk8.0 이후에 인터페이스에 추가된 멤버 -> 구현부가 존재하는 메서드
 * default 메서드 :
 * 				-구현부가 존재
 * 				-인스턴스 메서드
 * 				-오버라이딩 가능 : 다중 구현에서 동일한 메서드가 2개 이상인 경우, 구현 클래스에서 반드시 오버라이딩 필요
 * static 메서드 :
 * 				-구현부가 존재
 * 				-클래스 메서드, 클래스 멤버
 * 				-다중 구현에서 동일한 메서드가 2개 이상인 경우도 상관 없음 = 인터페이스명.static메서드명 호출 됨
 */
interface MyInterface1 {
	void method();
	default void method1() {
		System.out.println("MyInterface1의 default 메소드 : method1");
	}
	static void staticMethod() {
		System.out.println("MyInterface1의 static 메소드 : staticMethod");
	}
	
}
interface MyInterface2 {
	void method();
	default void method1() {
		System.out.println("MyInterface2의 default 메소드 : method1");
	}
	static void staticMethod() {
		System.out.println("MyInterface2의 static 메소드 : staticMethod");
	}
	
}
class Parent {
	public void method2() {
		System.out.println("Parent 클래스의 멤버 메서드 : method2");
	}
}
class Child extends Parent implements MyInterface1, MyInterface2 {
	public void method() {//MyInterface1, MyInterface2 인터페이스의 추상메서드 오버라이딩
		System.out.println("Child 클래스에서 오버라이딩 된 메서드 : method");
	}
	//default 메서드가 2개 이므로 오버라이딩 필요
	public void method1 () {
		System.out.println("Child 클래스에서 오버라이딩 된 메서드 : method1");
		MyInterface1.super.method1(); //MyInterface1의 method1 호출
		MyInterface2.super.method1(); //MyInterface2의 method1 호출
	}
}
public class InterfaceEx6 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		c.method1();
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();
	}

}
