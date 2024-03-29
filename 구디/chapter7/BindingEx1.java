package chapter7;
/*
 * 상위 클래스의 멤버와 하위 클래스의 멤버가 동일한 경우
 * 	멤버 변수 : 참조변수의 자료형을 따른다
 * 	멤버 메서드 : 객체의 자료형을 따른다. 객체의 최종 오버라이딩 된 메서드를 호출한다
 */
class Parent2 {
	int x =10;
	void method() {
		System.out.println("Parent2.method()");
	}
}
class Child2 extends Parent2 {
	int x =20;
	void method() {
		System.out.println("Child2.method()");
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}
public class BindingEx1 {

	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
		System.out.println("c.x = " + c.x);
		Parent2 p = c;
		p.method();//메서드와 변수가 달리 움직이는 현상(변수는 오버라이딩이 되지 않았다)
		System.out.println("p.x = " + p.x);
	}

}
