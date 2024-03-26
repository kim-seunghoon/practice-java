package chapter3;
/*
 * 이항연산자 : 산술연산자
 * +, -, *, /, %
 */
public class OpEx3 {

	public static void main(String[] args) {
		int x = 10, y = 8;
		System.out.println("10 / 8 = " + (10 / 8));
		System.out.println("-10 / 8 = " + (-10 / 8));
		System.out.println("10 / -8 = " + (10 / -8));
		System.out.println("-10 / -8 = " + (-10 / -8));
		//나머지는 분자의 기호를 따라간다
		System.out.println("10 % 8 = " + (10 % 8));
		System.out.println("-10 % 8 = " + (-10 % 8));
		System.out.println("10 % -8 = " + (10 % -8));
		System.out.println("-10 % -8 = " + (-10 % -8));
		
	}

}
