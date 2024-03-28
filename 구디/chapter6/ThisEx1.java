package chapter6;
/*
 *this 예약어
 *
 *this() 생성자 : 클래스 내부의 생성자에서 다른 생성자 호출 시 사용되는 예약어이며 반드시 생성자의 '첫줄에' 구현
 *
 *this 참조변수(자기 참조변수) : 현재 객체의참조값을 저장함, 인스턴스 메서드에서만 사용이 가능함 = 인스턴스 메서드 내부에 지역변수로 선언됨
 *						  지역번수와 멤버 변수가 같은 이름을 가진 경우 구분을 위해 사용함
 */
class Car4 {
	String color;
	int number;
	int sno;
	static int width = 200;
	static int height = 100;
	static int cnt;
	Car4(String color, int number) {
		this.color = color;
		this.number = number;
		sno = ++cnt;
		System.out.println("String c, int n 생성자 호출");
	}
	Car4(String c) {
		this(c, 1000); //맨 위에 있는 생성자 호출 this 생성자를 쓰기 전에 어떠한 것도 먼저 적을 수 없음
		System.out.println("String c 생성자 호출");
	}
	Car4(int n) {
		this("white", n); //맨 위에 있는 생성자 호출
		System.out.println("int n 생성자 호출");
	}
	public String toString() {
		return sno + "번 자동차 : " + color + ", " + number + " (" + width + ", " + height + ")";
	}
}
public class ThisEx1 {

	public static void main(String[] args) {
		Car4 c1 = new Car4("white", 1234);
		System.out.println(c1);
		System.out.println();
		Car4 c2 = new Car4("black");
		System.out.println(c2);
		System.out.println();
		Car4 c3 = new Car4(2000);
		System.out.println(c3);
	}

}
