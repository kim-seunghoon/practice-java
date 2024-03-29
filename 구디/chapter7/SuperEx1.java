package chapter7;
/*
 * super 예약어
 * super() 생성자 :
 * 		하위 클래스에서 상위 클래스의 생성자 호출 시 사용
 * 		하위 클래스의 생성자 첫줄에 구현해야 함
 * 		상위 클래스의 생성자 중 매개 변수가 없는 생성자가 있다면 생략 가능 : super()
 * 		상위 클래스의 생성자 중 매개 변수가 없는 생성자가 없다면 생략 불가능 : super(......)
 * super 참조변수 :
 * 		상위 클래스의 객체를 참조하는 참조변수
 * 		인스턴스 메서드에서만 사용 가능함
 */

class Parent {
	int x = 10;
	//Parent() {} //이게 있던가
	Parent(int x) {
		System.out.println("parent클래스의 생성자");
		this.x = x;
	}
}
class Child extends Parent {
	int x = 20;//멤버 변수
	Child() {//이게 있어야함
		super(100);//부모 것임. 부모 것을 100으로 초기화 한 상황
		System.out.println("child 클래스의 생성자");
	}
	void method() {
		int x = 30;//지역 변수
		System.out.println("x = " + x); //지역변수를 호출
		System.out.println("this.x = " + this.x);//멤버변수 호출
		System.out.println("super.x = " + super.x);
	}
}
public class SuperEx1 {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.x);
		c.method();
		
	}

}
