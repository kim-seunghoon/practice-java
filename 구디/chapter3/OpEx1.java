package chapter3;
/*
 * 단항연산자 : 연산자의 피연산자가 한 개인 경우
 * 1. 증감연산자 : ++, --
 */
public class OpEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5, y =5;
		x++;
		y--;
		System.out.println("x = " + x + ", y = " + y);
		++x;//앞에 붙어 있으면 우선 순위가 제일 빠름
		--y;
		System.out.println("x = " + x + ", y = " + y);
		x=y=5;
		y = x++;//우선 순위가 가장 느림
		System.out.println("x = " + x + ", y = " + y);
		x=y=5;
		System.out.println("x = " + x++);
		System.out.println("x = " + ++x);
		System.out.println("y = " + y++);
		System.out.println("y = " + ++y);
	}
}
