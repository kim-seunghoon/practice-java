package chapter7;
/*
 * final 메서드 : 재정의 불가 = 오버라이딩 불가 메서드
 */
class FinalMethod {
	final void method() {
		System.out.println("FinalMethod의 method");
	}
	void method1() {
		System.out.println("FinalMethod의 method1");
	}
	
}
class FinalMethodSub extends FinalMethod {
//	void method() {
//		System.out.println("FinalMethodSub의 method");
//	}
	void method1() {
		System.out.println("FinalMethodSub의 method1");
	}
}

public class FinalMethodEx1 {

	public static void main(String[] args) {
		FinalMethodSub f = new FinalMethodSub(); //오버라이딩이 안되니 상위 클래스의 메서드가 발생함
		f.method();
		f.method1();
	}

}
