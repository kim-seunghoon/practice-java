package chapter15;
interface LambdaInterface {
	void method ();
}
class Outer {
	public int iv = 10;
	void method() {
		int iv = 20;
		//람다방식으로 객체 생성
		LambdaInterface f = ()->{
			//Outer.this.iv : 외부클래스의 멤버 접근
			System.out.println("Outer.this.iv=" + Outer.this.iv);
			//this.iv : 외부클래스 객체의 iv 값 접근 가능
			System.out.println("Outer.iv=" + this.iv);
			System.out.println("iv=" + iv);
		};
		f.method();
		//인터페이스 객체 생성
		LambdaInterface f2 = new LambdaInterface() {
			public void method() {
				//Outer.this.iv : 외부클래스의 멤버 접근
				System.out.println("Outer.this.iv=" + Outer.this.iv);
				//this.iv : 내부클래스의 멤버 접근
//				System.out.println("Outer.iv=" + this.iv);
				System.out.println("iv=" + iv);
			}
		};
		f2.method();
	}
}
public class LambdaEx1 {

	public static void main(String[] args) {
		new Outer().method();
	}

}
