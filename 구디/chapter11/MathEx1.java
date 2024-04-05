package chapter11;
/*
 * Math 클래스
 * -수치 계산 관련 메서드 멤버로 가짐. 상순(PI(원주율), E(자연로그))
 * -final 클래스
 * -생성자의 접근제한자가 private -> 객체 생성 불가 = 모든 멤버가 static
 */
public class MathEx1 {

	public static void main(String[] args) {
		//abs : 절대값
		System.out.println(Math.abs(5.0));
		System.out.println(Math.abs(-5.0));
		//ceil, floor, rint : 근사정수 = 가장 가까운 정수
		//ceil : 큰 근사 정수
		System.out.println(Math.ceil(5.4));
		System.out.println(Math.ceil(-5.4));
		//floor : 작은 근사 정수
		System.out.println(Math.floor(5.6));
		System.out.println(Math.floor(-5.6));
		//rint : 가장 가까운 정수
		System.out.println(Math.rint(5.6));
		System.out.println(Math.rint(-5.6));
		
		//max(), min() 
		System.out.println(Math.max(5, 4));
		System.out.println(Math.min(5, 4));
		
		//round() : 반올림
		System.out.println(Math.round(5.4));
		
		//random() : 난수, 0<=x<1.0
		System.out.println(Math.random());
		
		//sin(), cos(), tan() : 삼각함수(라디안 단위)
		System.out.println(Math.sin(Math.PI/2)); //sin90
		System.out.println(Math.cos(Math.PI/2)); //cos90
		System.out.println(Math.tan(Math.PI/4)); //tan45
		
		//라디안 -> 각도
		System.out.println(Math.toDegrees(Math.PI));
		//각도 -> 라디안
		System.out.println(Math.toRadians(180));
		System.out.println(Math.sin(Math.toRadians(90)));
		//log 함수
		System.out.println(Math.log(Math.E));
		//제곱근
		System.out.println(Math.sqrt(25));
		//제곱
		System.out.println(Math.pow(5, 3));
	}

}
