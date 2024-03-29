package chapter7;
/*
 * instanceof 연산자 : 단항 연산자
 * 
 * 상위 클래스의 객체를 하위 클래스 타입의 참조 변수로 참조 불가 : classCastException 예외 발생
 */
public class InstanceOfEx1 {

	public static void main(String[] args) {
		Parent2 p = new Child2();
//		Child2 c = (Child2)p;
		if (p instanceof Child2) {
			System.out.println("p 참조변수가 참조하는 객체는 Child2 객체임");
			Child2 c = (Child2)p;
		}
		if (p instanceof Parent2) {
			System.out.println("p 참조변수가 참조하는 객체는 parent2 객체임");
			Parent2 p2 = p;
		}
		if (p instanceof Object) {
			System.out.println("p 참조변수가 참조하는 객체는 Object 객체임");
			Object o = p;
		}
		
	}

}
