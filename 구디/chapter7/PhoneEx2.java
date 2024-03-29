package chapter7;
/*
 * 하위 클래스의 객체 생성 시 상위 클래스의 객체 생성을 먼저 함
 * 하위 클래스의 생성자에서 상위 클래스의 생성자를 호출해야함
 * 상위 클래스의 매개변수가 없는 생성자가 없다면, 하위 클래스의 생성자에서 super(매개변수값)을 직접 호출해야함
 * 상위 클래스의 매개변수가 없는 생성자가 있다면, 하위 클래스의 생성자에서 super() 명령문을 생략할 수 있음
 */
class Phone2 {
	boolean power; 
	int number;
//	Phone2() {} 매개 변수가 없는 생성자
	Phone2(int number) {
		this.number = number;
	}
}
class SmartPhone2 extends Phone2 { //기본 생성자 제공 시 오류 발생
	SmartPhone2() {//기본 생성자의 틀(생략 돼있음)
		super(1234); 
	}
	void setApp(String name) {
		System.out.println(name + "앱 설치함");
	}
}
public class PhoneEx2 {

	public static void main(String[] args) {
		SmartPhone2 sp = new SmartPhone2();
		System.out.println(sp.number);
	}

}
