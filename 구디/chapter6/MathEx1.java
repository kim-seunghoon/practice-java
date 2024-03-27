package chapter6;
/*
 * 멤버 메서드(멤버함수, Function)
 * [접근제어자][제어자]리턴타입 메서드명(매개변수목록) => 선언부
 * {.....}								=> 구현부
 * 
 * 리턴타입 : 메서드 종료후 전달되는 값의 자료형. void인 경우느 전달 값이 없음
 * 매개변수 : 메서드 호출 시 메서드에 전달되는 값의 자료형 설정(자료형1 변수명1, 자료형2 변수명2,...)
 * 
 * return 예약어 : 메서드 종료
 * 		리턴타입이 void 면 생략가능 
 * 		리턴타입이 void가 아닌 경우 생략불가
 */

class Math1 {
	int add1(int a, int b) {
		return a + b; //a +b의 자료형 = int, 리턴타입 = int
	}
	long add2(int a, int b) {
		return a + b; //a +b의 자료형 = int, 리턴타입 = long(자동 형변환)
	}
	void add3 (int a, int b) { //리턴할 값이 없음
		return; //메서드 종료를 의미 함. 생략가능. 메서드의 } 닫는 중괄호가 실행되면 메서드 종료
	}
}

public class MathEx1 {
	public static void main(String[] args) {
		Math1 m1 = new Math1();
		int a1 = m1.add1(10, 20);
		System.out.println("a1 : " + a1);
		long a2 = m1.add2(40, 20);
		System.out.println("a2 : " + a2);
		m1.add3(10, 20);
		
	}

}
