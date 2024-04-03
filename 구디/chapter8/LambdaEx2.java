package chapter8;
/*
 * 추상메서드의 매개변수가 있고, 리턴타입이 없는 경우
 * (매개변수)->{...}
 * 매개변수가 한 개인 경우 () 생략가능
 * 실행구문의 무장이 한대인 경우 {} 생략가능
 */
interface LambdaInterface2 {
	void method(int a);
}
public class LambdaEx2 {

	public static void main(String[] args) {
		LambdaInterface2 f = (i)->{ //i변수의 자료형은 int 
			System.out.println(i*5);
		};
		f.method(5);
		f.method(2);
		f = i -> System.out.println(i+i);
		f.method(10);
		calc(f, 40);
		//calc 함수를 이용하여 입력된 숫자까지의 합을 출력하는 프로그램 구현하기
		f = a-> {
			int sum =0;
			for (int i = 0; i <= a; i++) {
				sum+=i;
			}
			System.out.println(sum);
		};
		calc(f,4);
		calc(f,10);
		calc(f,100);
	}
	static void calc(LambdaInterface2 f, int a) {
		f.method(a);
	} 
}
