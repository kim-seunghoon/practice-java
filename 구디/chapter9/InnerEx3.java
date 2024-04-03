package chapter9;
/*
 * 내부 클래스의 객체에서 사용되는 this
 */
class Pouter {
	int iv = 0;
}
class Outer3 extends Pouter {
	int iv = 10;
	int iv2 = 30;
	class InstanceInner {
		int iv =100;
		void method() {
			int iv = 300;
			System.out.println("iv = " + iv);
			/*
			 * 우선순위
			 * 1. 지역변수
			 * 2. 내부클래스의 멤버변수
			 * 3. 외부클래스의 멤버변수
			 * 4. 상위클래스의 멤버변수
			 */
			System.out.println("iv2 = " + iv2);
			//this : InstanceInner 내부클래스의 객체 참조하는 참조변수 = 외부클래스의 멤버 접근 불가
			System.out.println("this.iv = " + this.iv);
			//외부클래스의 멤버인 iv2 변수는 this로 접근 불가
//			System.out.println("this.iv2 = " + this.iv2);
			//InstanceInner의 부모클래스가 pouter 클래스가 아님
//			System.out.println("super.iv = " + super.iv);
			
			//외부클래스의 멤버 : 외부클래스명.this.멤버명
			System.out.println("Outer3.iv = " + Outer3.this.iv);
			//외부크랠스의 상위클래스 멤버 : 외부클래스명.super.멤버명
			System.out.println("Pouter3.iv = " + Outer3.super.iv);
		}
	}
}
public class InnerEx3 {

	public static void main(String[] args) {
		new Outer3().new InstanceInner().method();
	}

}
