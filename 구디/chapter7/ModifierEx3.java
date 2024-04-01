package chapter7;
import chapter7.test.Modifier2;
/*
 * 접근제어자 : private < default < protected < public
 * 
 * 멤버변수, 멤버메서드 : private < default < protected < public
 * 클래스			  : default < public
 * default 클래스	  : 같은 패키지에서만 접근 허용
 * public 클래스	  : 모든 접근 허용
 * 
 * 오버라이딩 조건
 * 1. 상위 클래스의 메서드명과 하위 클래스의 메서드명이 같다
 * 2. 매개변수 목록도 같아야 한다
 * 3. 리턴타입도 같아야 한다
 * 4. 접근제한자는 같거나, 큰 범위는 가능함
 * 
 */
class Modifier3 extends Modifier2 {//상속을 받아도 접근이 안되는 것을 확인하는 부분
	public void method() {
	System.out.println("chap7.Modifier3 클래스의 메서드");
//	System.out.println("v1 = " + v1); //private 멤버 접근 불가
//	System.out.println("v2 = " + v2); //default 멤버 접근 불가
	System.out.println("v3 = " + v3); //protected 멤버 접근 가능(상속일 때 허용되는 접근 제어자)
	System.out.println("v4 = " + v4); //public 멤버 접근 가능
	}
}	
public class ModifierEx3 {

	public static void main(String[] args) {
		Modifier2 m2 = new Modifier2();
		m2.method();
		Modifier3 m3 = new Modifier3();
		m3.method();
	}

}
