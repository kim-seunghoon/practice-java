package chapter7;
/*
 * 다형성 예제
 * 1. 하위클래스의 객체를 상위클래스형의 참조변수로 참조 가능함
 * 2. 상위 클래스 타입의 참조변수로 하위 클래스의 객체 참조 시 상위 타입의 멤버들만 접근 가능함
 * 3. 오버라이딩된 메서드는 상위 타입의 참조변수로 호출 가능, 최종 오버라이딩 된 메서드가 호출 됨
 * 4. 모든 클래스의 객체는 object 객체를 포함한다 = 모든 클래스의 객체는 object 타입으로 참조가 가능함
 * 
 */
class Bike2 {
	int wheel;
	Bike2(int wheel) {
		this.wheel = wheel;
	}
	void drive() {
		System.out.println("페달을 밟는다");
	}
	void stop() {
		System.out.println("브레이크를 잡는다");
	}
}
class EvBike2 extends Bike2 {
	boolean power;
	EvBike2() {
		super(2);
	}
	void power() {
		power = !power;
	}
	@Override
	void drive() {
		System.out.println("출발 버튼을 누른다");
	}
}
public class BIkeEx2 {

	public static void main(String[] args) {
		EvBike2 ev = new EvBike2();
		Bike2 b = null;
		ev.power();
		ev.drive();
		b = ev;
		b.drive();
		Object o = b;
//		o.power(); 오류 발생
//		o.drive();
//		o.stop();
		System.out.println(ev.toString());
		System.out.println(b.toString());
		System.out.println(o.toString());
	}

}
