package chapter3;
/*
 * 대입 연산자 : =, +=, -=, *=. /=
 * 
 * 좌측변수 = 우측값(변수, 값, 수식)
 * x+y=100 오류발생
 * x = 100 - y 정상작동
 */
public class OpEx6 {

	public static void main(String[] args) {
		int num = 100;
		System.out.println(num);
		num += 10;
		System.out.println(num);
		num -= 10;
		System.out.println(num);
		num *= 4;
		System.out.println(num);
		num /= 2;
		System.out.println(num);
		num %= 3;
		System.out.println(num);
		num += 17 + 4;
		System.out.println(num);
		
		byte b = 1;
		b = (byte)(b * 2);
		System.out.println(b);
	}

}
