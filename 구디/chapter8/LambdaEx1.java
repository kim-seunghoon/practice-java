package chapter8;
/*
 * 람다식(함수객체)예제 : jdk8 이후부터 사용 가능함, 람다식으로 사용되는 인터페이스는 FunctionalInterfac여야 함
 * FunctionalInterface : 추상메서드가 한 개만 존재하는 인터페이스
 * 
 * 추상메서드의 매개변수가 없고, 리턴 값도 없는 경우의 람다 표현방식
 * () -> {....}
 */
@FunctionalInterface //추상메서드가 한 개인 인터페이스(추상 메서드가 한 개인 것을  검증하는 기능)
interface LambdaInterface {
	void method();
}
public class LambdaEx1 {

	public static void main(String[] args) {
		//인터페이스는 객체화 불가 -> 익명의 객체 방식으로는 가능함
		//익명의 객체 방식. 람다 이전 방식.
		LambdaInterface f1 = new LambdaInterface() {
			@Override
			public void method() {
				System.out.println("익명의 객체 방식으로 코딩함");
			}
		};
		f1.method();
		//람다 방식 코딩
		LambdaInterface f2 = ()->{
			System.out.println("1.람다방식으로 코딩");
		};
		f2.method();
		//람다방식으로 코딩 시 코딩되는 내용이 한줄인 경우 {} 생략가능
		f2 = ()->System.out.println("2.람다방식으로 코딩");
		f2.method();
		execute(()->System.out.println("execute 메서드로 실행"));
		//1~100까지의 합을 execute 메서드로 출력하기
		execute(()->{
			int sum = 0;
			for (int i = 1; i < 101; i++) {
				sum += i;
			}
			System.out.println("1~100까지의 합 : " + sum);
		});
	}
	static void execute(LambdaInterface f) {
		f.method();
	}

}
