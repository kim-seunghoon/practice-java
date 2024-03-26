package chapter3;
/*
 * 단항 연산자
 * -논리부정연산자 : !
 * -부호연산자 : +, -
 * -형변환 연산자
 * (자료형)피연산자
 */
public class OpEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("true = " + !false);
		System.out.println("false = " + !true);
		System.out.println("3>5 ? = " + !(3>5));
		//부호연산자
		int x = -10;
		System.out.println("+x = " + +x);
		System.out.println("-x = " + -x);
		x = 10;
		System.out.println("+x = " + +x);
		System.out.println("-x = " + -x);
		
	}

}
