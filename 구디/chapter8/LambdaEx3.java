package chapter8;
/*
 * 매개변수도 있고, 리턴값도 있는 경우
 * 매개변수가 한 개인 경우 () 생략 가능
 * 실행 구문이 한 문장인 경우 {}, return 생략 가능
 */
interface LambdaInterface3 {
	int method(int x, int y);
}
public class LambdaEx3 {

	public static void main(String[] args) {
		LambdaInterface3 f = (x, y) -> {
			return x + y;
		};
		System.out.println("두 수의 합 : " + f.method(2, 5));
		f = (x, y) -> x*y;
		System.out.println("두 수의 곱 : " + f.method(2, 5));
		f = (x, y) -> x-y;
		System.out.println("두 수의 차 : " + f.method(2, 5));
		f = (x, y) -> x/y;
		System.out.println("두 수의 나누기 : " + f.method(2, 5));
		f = (x, y) -> x%y;
		System.out.println("두 수의 나머지 : " + f.method(2, 5));
		f = (x, y) -> (x>y)?x:y;
		System.out.println("두 수 중에 큰 수 : " + f.method(2, 5));
		f = (x, y) -> (x<y)?x:y;
		System.out.println("두 수 즁에 작은 수 : " + f.method(2, 5));
	}

}
