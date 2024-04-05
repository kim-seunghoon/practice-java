package chapter10;
/*
 * 오버라이딩에서의 예외처리
 * -상위클래스의 메서드와 하위 클래스의 메서드 선언부분이 같아야 한다
 * -단, 접근제어자는 넓은 범위는 가능
 * -예외처리는 좁은 범위는 가능
 */
import java.io.*;
class Parent {
	protected void method() throws RuntimeException {
		System.out.println("Parent 클래스의 method");
	}
}
class Child extends Parent {
	public void method() throws ArithmeticException, NullPointerException {
		System.out.println("Child 클래스의 method");
		try { //상위 클래스보다 더 높은 범위의 예외처리를 하려면 try, catch로 적어줘야한다
			FileInputStream fi = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
public class ExceptionEx8 {

	public static void main(String[] args) {
		new Child().method();
	}

}
