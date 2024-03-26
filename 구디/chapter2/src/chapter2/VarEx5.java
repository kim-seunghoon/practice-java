package chapter2;
/*
 * 다른 자료형들간의 연산
 * 큰자료형 + 작은자료형 = 큰자료형
 * 
 * String 클래스와의 연산
 * String 클래스의 특징
 * 1.참조자료형. 믄자열 정보 관련 클래스
 * 2.클래스 중 유일하게 대입 연산자로 객체 생성 가능 : 다른 클래스는 new 예약어로 객체 생성됨.
 * 3.클래스 중 유일하게 + 연산이 가능 String + 기본자료형
 */
public class VarEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1 = 100;
		long l1 = 200;
		long l2 = i1 + l1;
		int i2 = (int) (i1 + l1);
		System.out.println(l2);
		System.out.println(i2);
		
		byte b1 = 10;
		short s1 = 20;
		int i4 = b1 + s1;
		System.out.println(i4);
		
		String str = "번호";
		System.out.println(1+2+str);//먼저 정수 계산 후 문자열로 변환
		System.out.println(str+1+2);//문자열로 계산되니 1이 붙고 문자열 + 정수라서 2도 그냥 따라 붙음
		System.out.println(1+2+"");
		System.out.println(""+1+2);
		str = "1" + false;
		System.out.println(str);
	}

}
