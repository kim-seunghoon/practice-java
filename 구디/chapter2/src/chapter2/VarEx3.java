package chapter2;
/*
 * 기본자료형의 형변환
 * 1.기본자료형 중 boolean을 제외한 7개의 자료형간에는 서로 형변환이 가능함
 * 		논리형 : boolean
 * 		문자형 : char
 * 		정수형 : byte, short, int, long
 * 		실수형 : float, double
 * 2.기본자료형과 참조자료형은 형변환 불가(wrapper class는 가능함)
 * 3.자동형변환 : 형변환 연산자 생략 가능 작은 자료형 => 큰 자료형
 * 4.명시적형변환 : 형변환 연산자 생략 불가 큰 자료형 => 작은 자료형
 * 5.자료형의 크기 순서
 * byte(1) < short(2) = char(2) <int(4) < long(8) < float(4) < double(8)
 */
public class VarEx3 {

	public static void main(String[] args) {
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		float f = (float)50;//형변환 연산자 생략 가능
		double d = (double)60;//형변환 연산자 생략 가능
		char c = (char)b; //char <- byte, short인 경우는 명시적 형변환
		short s2 = b;
		f = 1.0f;
		System.out.println(f);
	}

}
