package chapter7;
/*
 * final 변수 : 변경불가 변수 = 상수. 
 * 상수값의 이름 규칙 : snake방식 _사용
 */
class FinalValue {
	final int NUM;
	static final int max;
	static {
		max = (int)(Math.random());
	}
	FinalValue(int nUM) {
		NUM = nUM; // 명시적 초기화가 안 된 경우 생성자에서 한 번은 초기화 가능 객체별로 다른 상수값 설정 가능
	}
}
public class FinalValueEx1 {

	public static void main(String[] args) {
		final int num = 100;
		final int max; //초기화 하지 않으면 한 번은 초기화 가능
		max = 200;
		FinalValue fv1 = new FinalValue(10);//첫 초기화 부분
		FinalValue fv2 = new FinalValue(20);
		System.out.println(fv1.NUM);
		System.out.println(fv2.NUM);
//		fv1.NUM = 100;//이미 초기화 돼 변경 불가
//		fv2.NUM = 200;
		final int[] arr = {10,20,30,40,50};
		for (int a : arr) {
			System.out.print(a+ ", ");
		}
			arr[0] = 100;
			arr[1] = 200;
		
		System.out.println();
		for (int a : arr) {
			System.out.print(a +", ");
		}
	}

}
