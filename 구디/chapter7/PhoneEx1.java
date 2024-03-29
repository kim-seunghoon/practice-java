package chapter7;
/*
 * 상속 예제 : extends 예약어를 이용하여 구현
 * -하위 클래스 의 객체 생성 시 상위 클래스의 객체를 먼저 생성함
 * -단일 상속만 가능함
 * -모든 클래스는 object 클래스를 상속받음 = 모든 클래스의 객체는 object 객체를 포함한다 = 모든 클래스의 객체는 object 객체의 멤버 호출이 가능함
 */
class Phone {
	boolean power;
	int number;
	void power() {
		power = !power;
	}
	void send() {
		if(power) System.out.println("전화걸기");
	}
	void receive () {
		if(power) System.out.println("전화받기");
	}
}
//SmartPhone 클래스는 Phone 클래스의 하위 클래스
class SmartPhone extends Phone {
	void setApp(String name) {
		System.out.println(name + "앱 설치");
	}
}
public class PhoneEx1 {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.power = true;
		sp.send();
		sp.receive();
		sp.setApp("카카오");
	}

}
