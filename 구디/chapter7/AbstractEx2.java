package chapter7;
/*
 * 추상클래스간의 상속
 */
abstract class Abs1 {
	int a = 10;
	abstract int getA();
}
abstract class Abs2 extends Abs1 {//2도 추상클래스라 1한테 상속 받아도 문제 x
	int b = 20;
	abstract int getB();
}
class Nomal extends Abs2 {

	@Override
	int getB() {
		return b;
	}

	@Override
	int getA() {
		return a;
	}
	
}
public class AbstractEx2 {

	public static void main(String[] args) {
		Nomal n = new Nomal();
		System.out.println(n.a);
		System.out.println(n.getA());
		System.out.println(n.b);
		System.out.println(n.getB());
		System.out.println("-------Abs2 타입으로 형변환---------");
		Abs2 a2 = n; //상위 타입의 참조변수 <- 하위타입의 참조변수가 상위 타입의 참조변수로 = 자동형변환 가능
		System.out.println(a2.a);
		System.out.println(a2.getA());
		System.out.println(a2.b);
		System.out.println(a2.getB());
		System.out.println("-------Abs1 타입으로 형변환---------");
		Abs1 a1 = a2;
		System.out.println(a1.a);
		System.out.println(a1.getA());
//		System.out.println(a1.b); b는 Abs2의 멤버임
//		System.out.println(a1.getB());
		System.out.println("-------Object 타입으로 형변환---------");
		Object o = a1;// 다 안되지만 반드시 사용하고 싶다면
		System.out.println(((Abs1)o).a);
		System.out.println(((Abs1)o).getA());
		System.out.println(((Abs2)o).b);
		System.out.println(((Abs2)o).getB());
	}
}
